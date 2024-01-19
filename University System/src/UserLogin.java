import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class UserLogin implements Runnable {
    Socket socket;

    public UserLogin(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (
                PrintWriter sender = new PrintWriter(socket.getOutputStream(), true);
                Scanner receiver = new Scanner(socket.getInputStream());
        ) {
            sender.println("Enter username: ");
            String username = receiver.nextLine();
            sender.println("Enter password: ");
            String password = receiver.nextLine();

            User user = Server.getUser(username, password);

            if (user != null) {
                System.out.println("Logged successfully!");
            } else {
                System.out.println("Unsuccessful login");
                return;
            }

            switch (user.getUserType()) {
                case STUDENT -> studentMenu(sender, receiver, (Student) user);
                case TEACHER -> teacherMenu(sender, receiver);
                case ADMIN -> adminMenu(sender, receiver);
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public void studentMenu(PrintWriter sender, Scanner receiver, Student student) {
        student.grades.sort((o1, o2) -> {
            if (o1.semester == o2.semester) {
                return o1.subject.compareTo(o2.subject);
            }
            if (o1.semester > o2.semester) {
                return 1;
            } else {
                return -1;
            }
        });
        for (Grade grade : student.grades) {
            sender.print("semester " + grade.semester + "\t" + grade.subject + "\t" + grade.grade + ";");
        }
        sender.println("END");
    }


    public void teacherMenu(PrintWriter sender, Scanner receiver) {
        sender.println("Teacher menu: ");
        String facNum = receiver.nextLine();
        Student student = null;
        for (User user : Server.users) {
            if (user.getUserType() == UserType.STUDENT && ((Student) user).Facnum.equals(facNum)) {
                student = (Student) user;
                break;
            }
        }
        if (student == null) {
            return;
        }

        sender.println("Enter subject: ");
        String subject = receiver.nextLine();
        sender.println("Enter semester: ");
        int semester = receiver.nextInt();
        sender.println("Enter grade: ");
        double grade = receiver.nextDouble();
        student.grades.add(new Grade(subject, semester, grade));
        sender.println("END");
    }

    public void adminMenu(PrintWriter sender, Scanner receiver) {
        sender.println("Choose 1 (student), 2(teacher), 3(admin)");
        String type = receiver.nextLine();
        if (!type.equals("1") && !type.equals("2") && !type.equals("3")) {
            return;
        }

        sender.println("Enter username: ");
        String username = receiver.nextLine();
        sender.println("Enter password: ");
        String password = receiver.nextLine();
        //if (!password.matches(".{5,}")) {
         //   return;
        //}
        synchronized (Server.users) {
            switch (type) {
                case "1":
                    sender.println("Enter student id: ");
                    String facNum = receiver.nextLine();
                    if (!facNum.matches("[0-9]{9}")) {
                        return;
                    }
                    sender.println("Enter id: ");
                    String id = receiver.next();
                    if (!id.matches("[0-9]{10}")) {
                        return;
                    }
                    Server.users.add(new Student(username, password, facNum, id));
                    break;
                case "2":
                    sender.println("Enter email: ");
                    String email = receiver.nextLine();
                    if (!email.matches("[a-z]+@tu-sofia.bg")) {
                        return;
                    }
                    Server.users.add(new Teacher(username, password, email));
                    break;
                case "3":
                    Server.users.add(new Admin(username, password));
                    break;
            }
            sender.println("END");
        }
    }
}
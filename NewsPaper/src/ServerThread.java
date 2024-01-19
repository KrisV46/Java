import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ServerThread implements Runnable {
    Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public  void run() {
        try (
                PrintWriter sender = new PrintWriter(socket.getOutputStream(), true);
                Scanner receiver = new Scanner(socket.getInputStream());

        ) {
            sender.println("Enter username: ");
            String username = receiver.nextLine();
            sender.println("Enter password");
            String password = receiver.nextLine();

            User user = Server.getUser(username, password);


            switch (user.getUserType()) {
                case WRITER -> writerMenu(sender, receiver);
                case ADMINISTRATOR -> adminMenu(sender, receiver);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void writerMenu(PrintWriter sender, Scanner receiver) {
        sender.println("Welcome to the writer menu ");
        String author = receiver.nextLine();
        Article.article.add(new Article(author));
    }

    private void adminMenu(PrintWriter sender, Scanner receiver) {
        sender.println("Welcome to admin menu, Choose 1(Writer), 2(Editor), 3(Admin) ");
        String type = receiver.nextLine();
        if (!type.equals("1") && !type.equals("2") && !type.equals("3")) {
            return;
        }
        sender.println("Enter username: ");
        String username = receiver.nextLine();
        sender.println("Enter password: ");
        String password = receiver.nextLine();
        if (!password.matches("[a-zA-Z0-9]{6}")) {
            return;

        }
        switch (type) {
            case "1":
                Server.users.add(new Writer(username, password));
                break;
            case "2":
                Server.users.add(new Editor(username, password));
                break;
            case "3":
                Server.users.add(new Administrator(username, password));
                break;
        }

    }
}

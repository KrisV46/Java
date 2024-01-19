import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static List<User> users = new ArrayList<>();
    public static void main(String[] args) {
        try(
                ServerSocket server = new ServerSocket(8080);
                ExecutorService pool = Executors.newFixedThreadPool(10)
                ){
            while (true) {
                Socket socket = server.accept();
                pool.execute(new ServerThread(socket));
                System.out.println("Client is connected! ");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static User getUser(String username, String password){
        for(User user : users){
            if(user.getUsername().equals(username) && user.checkPassword(password)){
                return user;
            }
        }return null;
    }
}

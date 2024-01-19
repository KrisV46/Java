import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static List <User> users = new ArrayList<>();
    public static void main(String[] args) {
        try (
                ServerSocket server = new ServerSocket(8080);
                ExecutorService pool = Executors.newCachedThreadPool();
        ) {
            while (true) {
                Socket socket = server.accept();
                pool.execute(new UserLogin(socket));
                System.out.println("client is connected");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

        public static User getUser(String username, String password){ //Валидираме парола и юзърнейм
            for (User user : users) {
                if (user.checkUsername(username) && user.checkPassword(password)) {
                    return user;
                }
            }
            return null;
        }
    }



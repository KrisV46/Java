public abstract class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean checkUsername(String username) {
        return this.username.equals(username);
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public UserType getUserType() {
        if (this instanceof Student) {
            return UserType.STUDENT;
        } else if (this instanceof Teacher) {
            return UserType.TEACHER;
        } else if (this instanceof Admin) {
            return UserType.ADMIN;
        }
        throw new RuntimeException();
    }
}

public abstract class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public UserType getUserType(){
        if (this instanceof Writer){
            return UserType.WRITER;
        }
        if(this instanceof Editor){
            return UserType.EDITOR;
        }
        if (this instanceof Administrator){
            return UserType.ADMINISTRATOR;
        }
        return null;
    }
    public String getUsername(){
        return username;
    }
    public boolean checkPassword(String password){
        return this.password.equals(password);
    }
}

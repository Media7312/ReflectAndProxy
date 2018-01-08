public class User {
    private String username;
    private String password;

    public User() {
        System.out.println("User的构造方法");
    }

    public void printUser(){
        System.out.println("User的printUser方法");
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

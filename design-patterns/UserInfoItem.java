public class UserInfoItem {
    private String username;
    private String password;

    private int usertype;

    public UserInfoItem(String username, String password, int usertype) {
        this.username = username;
        this.password = password;
        this.usertype=usertype;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public int getUsertype(){
        return this.usertype;
    }
}

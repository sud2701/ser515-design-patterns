import java.util.Scanner;

public class Login {
    int userType;

    Login() {
        userType = 0;
    }

    public int login() {
        System.out.print("Please enter your username: ");
        Scanner x = new Scanner(System.in);
        String username = x.nextLine();
        System.out.print("Please enter your password: ");
        String password = x.nextLine();
        if (username.equals("Sudheer") && password.equals("2701")) {
            userType = 1;
        } else if (username.equals("Harish") && password.equals("1023")) {
            userType = 1;
        } else if (username.equals("Swarna") && password.equals("1001")) {
            userType = 1;
        } else if (username.equals("Srinivas") && password.equals("1006")) {
            userType = 0;
        } else if (username.equals("Saahas") && password.equals("1201")) {
            userType = 0;
        } else {
            System.out.println("Invalid User");
            System.exit(-1);
        }
        return userType;
    }
}

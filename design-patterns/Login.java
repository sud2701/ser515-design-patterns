import java.io.*;
import java.util.Scanner;

public class Login {

    Login() {
    }

    public boolean is_verified_user(String username, String password, int userType) throws IOException {
            Scanner x = new Scanner(System.in);

            String s;
            BufferedReader reader;
            switch(userType) {
                case 0:
                    reader = new BufferedReader(new FileReader("BuyerInfo.txt"));
                    s = reader.readLine();
                    while (s != null) {
                        String[] words = s.split(":");
                        if (words[0].equals(username) && words[1].equals(password)) {
                            return true;
                        }
                    }
                    if (s == null) {
                        System.out.println("Not a Verified Buyer");
                        return false;
                    }
                    break;
                case 1:
                    reader = new BufferedReader(new FileReader("SellerInfo.txt"));
                    s = reader.readLine();
                    while (s != null) {
                        String[] words = s.split(":");
                        if (words[0].equals(username) && words[1].equals(password)) {
                            return true;
                        }
                    }
                    if (s == null) {
                        System.out.println("Not a Verified Seller");
                        return false;
                    }
                    break;
                case 2:
                    System.exit(-1);
                    break;
                default:
                    System.out.println("Invalid Entry");
                    System.out.println("Please Try Again");
                    return false;
        }
        return false;
    }

    public boolean login() throws IOException {
        int wrong_attempts=0;
        boolean temp;
        Scanner x = new Scanner(System.in);
        String password,username;
        int userType;
        while(wrong_attempts<5){
            System.out.print("Please enter your username: ");
            username = x.nextLine();
            System.out.print("Please enter your password: ");
            password = x.nextLine();
            System.out.println("Users: \n 0. Buyer \n 1. Seller \n 2. Exit");
            System.out.print("Please enter your user type: ");
            userType = x.nextInt();
            temp=is_verified_user(username,password,userType);
            if(temp){
                UserInfoItem userObject=new UserInfoItem(username,password,userType);
                System.out.println("Login Successful!! \n Welcome User: "+username);
                return true;
            }
            else{
                wrong_attempts+=1;
                System.out.println("Login Unsuccessful!!");
            }
        }
        if(wrong_attempts==5){
            System.out.println("Too many unsuccessful Login attempts!!");
            return false;
        }

        return false;
    }
}

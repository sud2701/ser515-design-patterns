import java.io.*;
import java.util.Scanner;

public class Login {
    int userType;

    Login() {
        userType = 0;
    }

    public int login() throws IOException {
        System.out.print("Please enter your username: ");
        Scanner x = new Scanner(System.in);
        String username = x.nextLine();
        System.out.print("Please enter your password: ");
        String password = x.nextLine();
        System.out.println("Users: \n 0. Buyer \n 1. Seller");
        System.out.print("Please enter your user type: ");
        userType=x.nextInt();
        BufferedReader reader;
        if(userType==0) {
            reader = new BufferedReader(new FileReader("BuyerInfo.txt"));
            String s=reader.readLine();
            while(s!=null){
                String[] words=s.split(":");
                if(words[0].equals(username) && words[1].equals(password)){
                    userType=0;
                    break;
                }
            }
            if(s==null){
                System.out.println("Invalid Buyer");
                System.exit(-1);
            }
        }
        else{
            reader = new BufferedReader(new FileReader("SellerInfo.txt"));
            String s=reader.readLine();
            while(s!=null){
                String[] words=s.split(":");
                if(words[0].equals(username) && words[1].equals(password)){
                    userType=1;
                    break;
                }
            }
            if(s==null){
                System.out.println("Invalid Seller");
                System.exit(-1);
            }
        }
        return userType;
    }
}

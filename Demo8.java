import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String loginid = null;
        String pwd = null;
        String reply;
        do { 
            System.out.println("Welcome to mallareddyuniversity");
            System.out.println("have you visited our site eariler");
            reply = sc.nextLine();
            if(reply == "no") {
                System.out.println("login here");
                System.out.println("enter ur id and pwd");
                loginid = sc.nextLine();
                pwd = sc.nextLine();
            }else
            System.out.println("you are our valued customer");
        } while (("pavankumar".equals(loginid)) && (pwd == "12345"));
    }
}
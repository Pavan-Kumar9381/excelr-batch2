import java.util.Scanner;

class Demo09 {
    String Cust_Name = "Pavan kumar";
    long Account_no = 123456;
    Double Balance = 10000.00;

    void accept_details() {
        System.out.println("Enter your name and account number:");
        try (Scanner sc = new Scanner(System.in)) {
            Cust_Name = sc.nextLine();
            Account_no = sc.nextLong();
        }
        
    }

    void Display_details() {
        System.out.println("Hello " + Cust_Name);
        System.out.println("Your balance is " + Balance);
    }

    public static void main(String[] args) {
        Demo09 obj = new Demo09();
        obj.accept_details();
        obj.Display_details();
    }
}
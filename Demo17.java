import java.util.Scanner;

public class Demo017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
22
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
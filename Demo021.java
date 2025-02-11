public class Demo021 {
    public static void main(String[] args) {
        double income = 75000; 
        double tax = calculateTax(income);
        
        System.out.println("Income: " + income);
        System.out.println("Tax: " + tax);
    }

    public static double calculateTax(double income) {
        double tax = 0;

        if (income <= 25000) {
            tax = income * 0.10; 
        } else if (income <= 50000) {
            tax = 2500 + (income - 25000) * 0.20;
        } else {
            tax = 7500 + (income - 50000) * 0.30; 
        }

        return tax;
    }
}


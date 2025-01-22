public class ltcode2 {
    public int reversed(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;

           
            if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE/10 && digit > 7)) return 0;
            if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE/10 && digit < -8)) return 0;

            reversed = reversed * 10 + digit;
        }
        return reversed;
    }

    public static void main(String[] args) {
        ltcode2 ri = new ltcode2();
        
       
        System.out.println(ri.reversed(123)); 
        
     
        System.out.println(ri.reversed(-123)); 
        
        
        System.out.println(ri.reversed(120)); 
    }
}
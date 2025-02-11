public class Demo023{
    public static void main(String[] args){
        String s="viv";
        int n=s.length();
        boolean palindrome=true;
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                palindrome=false;
            }
        }
        if(palindrome){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

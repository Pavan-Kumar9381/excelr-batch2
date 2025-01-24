public class Demo40 {
    public static void main(String[] args){
        char ch = 'b';
        char lowerCaseCh = Character.toLowerCase(ch);
        if(lowerCaseCh == 'a'|| lowerCaseCh == 'e' || lowerCaseCh == 'i' || lowerCaseCh == 'o'|| lowerCaseCh == 'u'){
            System.out.println(ch+ "is a vowel");
        }
        else if(Character.isLetter(lowerCaseCh)){
            System.out.println(ch+ "is a constonant");
        } else {
            System.out.println(ch+ "is not a letter");
        }
    }
}

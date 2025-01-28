import java.util.Iterator;
import java.util.LinkedHashSet;
public class Demo033 {
    void linkedHashsetMethod(){
        LinkedHashSet <Integer>lhs = new LinkedHashSet<>();
        lhs.add(20);
        lhs.add(30);
        lhs.add(60);
        lhs.add(80);
        System.out.println(lhs);
        lhs.remove(30);

     
		int sum=0;
		for(Integer x : lhs) {
			sum += x;
		}

		System.out.println("The sum is :" + sum);

		Iterator<Integer> it = lhs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

class Main {
    public static void main(String[] args) {
        Demo033 obj = new Demo033();
        ((Object) obj).linkedHashsetMethod();
    }
}
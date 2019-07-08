import java.util.ArrayList;
import java.util.Iterator;


public class IteratorEx {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(11);
		al.add(13);
		al.add(14);
		al.add(15);
		Iterator<Integer> i=al.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}

}

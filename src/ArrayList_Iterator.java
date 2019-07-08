import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList_Iterator {
public static void main(String[] args) {
	ArrayList<String>  al= new ArrayList<>();
	al.add("gopal");
	al.add("raja");
	al.add("yaswanth");
	System.out.println("this is just priting " +al);
	Iterator itr=al.iterator();
	 while(itr.hasNext()){
		System.out.println(itr.next());
		
	}
	
}
}

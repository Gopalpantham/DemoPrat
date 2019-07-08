import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetWithIterator {

	public static void main(String[] args) {
Set<String> s=new HashSet<> ();
s.add("asdf");
s.add("zxxx");
s.add("asdf");
s.add("wwqqe");
System.out.println("just simple"+s);
Iterator itr=s.iterator();
while(itr.hasNext()){
	System.out.println(itr.next());
}
	}

}

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class MapIterator {

	public static void main(String[] args) {
Map<Integer,String> m=new HashMap<>();
m.put(1,"gopal");
m.put(2, "asdf");
m.put(null, "aqss");
m.put(null, "oassk");
m.put(3,null);
System.out.println("Simlply "+m);
Iterator<Entry<Integer, String>> itr = m.entrySet().iterator(); 

while(itr.hasNext()) 
{ 
     Entry<Integer, String> entry = itr.next(); 
     System.out.println("Key = " + entry.getKey() +  
                         ", Value = " + entry.getValue());
}
}}





 
import java.util.HashMap;
  
public class SizeHashMap {
  
  public static void main(String[] args) {
  
    // Create a HashMap and populate it with elements
    HashMap hashMap = new HashMap();
    hashMap.put("key_1","value_1");
    hashMap.put("key_2","value_2");
  
    // int size() operation returns the number of key value pairs stored in HashMap    
    System.out.println("Size of HashMap : " + hashMap.size());
  }
}


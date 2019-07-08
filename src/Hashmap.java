import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		m.put(1, "prasad");
		m.put(1, "gopal");
		Set s = m.entrySet();
		Iterator i = s.iterator();
		while (i.hasNext()) {
			Map.Entry<Integer, String> enr = (Entry<Integer, String>) i.next();
			System.out.println(enr.getKey() + " value =  " + enr.getValue());
		}

	}

}

import java.util.HashMap;
import java.util.Map;
public class CharCount {
	public static void main(String[] args) {
		String s="jocata";
		Map<Character, Integer> m=new HashMap<>();
		for(Character c : s.toCharArray()){
			if(m.containsKey(c))
			{
				m.put(c,
						m.get(c)+1);
			}else{
				m.put(c, 1);
			}
		}
		System.out.println(m);
	}
}

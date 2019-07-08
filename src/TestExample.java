import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class TestExample {

	public static void main(String[] args) {
		int a = 0;
		int b = 2;
		int n = 10;
		List<Integer> list = new ArrayList<Integer>();
		int result = 0;
		for(int i = 0;i<n-1;i++){
			result += a + Math.pow(2,i)* b;  
			list.add(result);
		}
		/*Iterator l = list.iterator();
		while (l.hasNext()) {
			System.out.print(l.next() +" ");
		}*/
		//list.forEach(k ->System.out.print(k + " "));
		list.stream().forEach(System.out::print );
	}

/*	private static int power(int i, int i2) {
		int result = 1;
		for(int o=0;o<i2;o++){
			result = result * i;
		}
		return result;
	}*/

}

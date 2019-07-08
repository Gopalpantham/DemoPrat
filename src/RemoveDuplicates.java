import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class RemoveDuplicates {

	public static void main(String[] args) {
		/* String duplicate[]=new String[]{"gopal","krishna","pantham","gopal","krishna"};
		Set nonduplicateSet=new HashSet<>();
		Set duplicateSet=new HashSet<>();
		for(String s: duplicate){
			if(!nonduplicateSet.contains(s)){
				nonduplicateSet.add(s);
			}else{
				nonduplicateSet.remove(s);
				duplicateSet.add(s);
			}
		}
		System.out.println(nonduplicateSet);
		System.out.println(duplicateSet);
			}
			{		}	*/
		Integer duplicate[]=new Integer[]{1,2,4,5,3,2,1,1,1,2,2,2};
		Set nonduplicateSet=new HashSet<>();
		Set duplicateSet=new HashSet<>();
		List tempSet = new ArrayList<>();
		for(	Integer s: duplicate){
			if(!nonduplicateSet.contains(s)){
				nonduplicateSet.add(s);
			}else{
				tempSet.add(s);
				nonduplicateSet.remove(tempSet);
				duplicateSet.add(s);
			}
		}
		System.out.println("Not duplicate values"+nonduplicateSet);
		System.out.println("Duplicate values"+duplicateSet);
	}}
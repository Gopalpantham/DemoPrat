import lombok.Data;


@Data
class Test {
		private String  id;
		private String name;
		private String year;

}


public class LombokTest{
	
	public static void main(String[] args) {
		Test t = new Test();
	
	}
}
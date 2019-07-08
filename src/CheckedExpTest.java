import java.io.PrintWriter;


public class CheckedExpTest {

	public static void main(String[] args) throws Exception {
PrintWriter pw= new  PrintWriter("abc.txt");
pw.println("Hello");
System.out.println(10/0);
	}

}

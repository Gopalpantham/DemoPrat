
public class StaticDemo {

	public static void main(String[] args) {
		Abc.show();
	}

}
class Abc{
	static int i=5;
	public static void show(){
		System.out.println("Hi");
		System.out.println(i);
	}
}
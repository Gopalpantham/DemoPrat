interface A{
	void show(int i);
}
/*class Xyz implements A{
	public void show() {
System.out.println("Hello");		
	}
	
}*/
public class LambdaExp {
	public static void main(String[] args) {
A obj;
/*obj=new A(){
	public void show() {

	System.out.println("Hello");		
	}
};
*/
obj =(i)->System.out.println("Hello "+i);		
	
obj.show(6);
	}
	}


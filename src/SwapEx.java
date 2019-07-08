import java.util.Scanner;


public class SwapEx {

	public static void main(String[] args) {
		int a,b,c;
	System.out.println( "Enter a and b value");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println("Before swaping=a  "+a +  "b  "+b);
	c=a;
	a=b;
	b=c;
	System.out.println("After swaping =a  "+a +  "b  "+b);
	}
}

import java.util.Scanner;


public class StringConverstion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Enter a world in Uppercase : "+ str);
		String s=str.toUpperCase();
		System.out.println("The LowerCase  world is : "+ s);
	}
}

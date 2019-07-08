import java.util.Scanner;


public class ReverseEx {

	public static void main(String[] args) {
	/*	String input="GOPAL"; 
		char[]  a=input.toCharArray();
		for(int i=a.length-1; i>=0; i--){
			System.out.print(a[i]);*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Word :");
String s=sc.nextLine();
String rev="";
for(int i=s.length()-1;i>=0;i--){
	rev=rev+s.charAt(i);
}
	System.out.println(rev);
		
	}
}

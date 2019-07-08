import java.util.Scanner;


public class PalindromEx {

	public static void main(String[] args) {
		String rev="";
		System.out.println("Please Enter a World!!");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(int i=str.length()-1;i>=0;i--){
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)){
			System.out.println("This is palindrom");
		}
		else{
			System.out.println("this is not Palindrom");
		}
	}
}

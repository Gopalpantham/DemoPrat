import java.util.Scanner;


public class CapitalToSamll {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		char ch;
		int t;
		System.out.println("Enter a word in upper cases : ");
		ch=sc.next().charAt(0);
		t=(int)ch;
		t=t+32;
		ch=(char)t;
		System.out.println("Lower case is " + ch);
	}

}

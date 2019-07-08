
public class AmstrongNoEx {
	public static void main(String[] args) {
		int n=153,r ,p ,m=0;
		p=n;
		while(n>0){
			r=n%10;
			m=m+r*r*r;
			n=n/10;
		}
		if(m==p)
			System.out.println("it is a amstrong number");
		else{
			System.out.println("it not a amstrong number");
		}
	}
}  


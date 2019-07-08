
public class GivenPrimeNo {

	public static void main(String[] args) {
int n=24;
boolean isPrime=true;
for(int i=2;i<Math.sqrt(n);i++){
	if(n%i==0){
		isPrime=false;
		break;
	}
}
if(isPrime){
	System.out.println(n  + " is Prime No");
}
	else{System.out.println(n +  " is Not Prime No");
	}

}}

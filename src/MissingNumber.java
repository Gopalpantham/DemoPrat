

public class MissingNumber {

	public static void main(String[] args) {
		int[] a={13,12,11,10,9,7,5,6,8,4,3,2,1,14,15,16,17,18,20};
		//int[] a={11,22,33,55,44,66,88};
		int n=a.length+1;
		int total=n*(n+1)/2;
		//int total=(n*(n+1)/2)*11;
		//System.out.println(total);
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
		}
		int o =  total-sum;
		System.out.println("missing no is :"+(o));
	}
}

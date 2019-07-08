
public class SecondLagestNumber {

	public static void main(String[] args) {
		int a[]={6,8,5,3,1,2,7,9,4};
		int temp;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Second lagest element is "+ a[1]);
	}

}

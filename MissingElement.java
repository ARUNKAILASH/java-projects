package testpractice;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,5};
		int l=a.length+1;int sum=0;
		for(int i=0;i<l-1;i++) {
			sum+=a[i];
		}System.out.println((l*(l+1)/2)-sum);

	}

}

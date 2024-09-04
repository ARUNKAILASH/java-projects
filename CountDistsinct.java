package testpractice;
import java.util.*;
public class CountDistsinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,4,5,6,5,9,4,4};
		int c=0;
		int n=arr.length;
		boolean u= true;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(i!=j) {
					if(arr[i]==arr[j]) {
						u=false;
						break;
					}
				}
			}if(u==true) {
				c++;
			}u=true;
		}
		System.out.println(c);

	}

}

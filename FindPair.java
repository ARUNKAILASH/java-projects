package testpractice;
import java.util.*;
public class FindPair {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []arr= {8,7,2,5,3,1};
		int target=sc.nextInt();
		int n=arr.length;
		int pair[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==target && arr[i]!=arr[j]) {
					System.out.print(arr[i]);
					System.out.println(arr[j]);
					
				}
			}
		}
	}

}

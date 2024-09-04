package testpractice;
import java.util.Scanner;

public class kthelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the array:");
		int a[]=new int[5];
		for(int i=0;i<5;i++) {
			a[i]=scanner.nextInt();
		}
		System.out.println("Enter the kth element to search:");
		int k=scanner.nextInt();
		System.out.println(a[k-1]);
		

	}

}

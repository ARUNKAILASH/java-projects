package testpractice;
import java.util.*;
public class FishPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++) {
				System.out.print("*"+" ");
			}
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*(i);j++) {
				System.out.print(" ");
			}
			for(int k=1;k<((2*n)-2*i);k++) {
				System.out.print("*"+" ");
			}
			for(int j=1;j<=2*(i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*(i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n-i;j++) {
				System.out.print("*"+" ");
			}System.out.println();
			
		}

	}

} 

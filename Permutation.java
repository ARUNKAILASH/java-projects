package testpractice;
import java.util.*;
public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		System.out.println(fact(n)/fact(n-r));
		

	}
	static int fact(int a) {
		int f=1;
		for(int i=1;i<=a;i++) {
			f=f*i;
		}return f;
	}

}

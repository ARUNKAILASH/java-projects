package testpractice;
import java.util.*;
public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[50];
int i;
for(i=0;n>0;i++) {
	a[i]=n%2;
	n=n/2;
}
for(int j=i;j>=0;j--) {
	System.out.print(a[j]);
}
	}

}

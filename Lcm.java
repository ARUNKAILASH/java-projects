package testpractice;
import java.util.Scanner;
public class Lcm {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a num1:");
		int num1=scanner.nextInt();
		System.out.println("Enter a num2:");
		int num2=scanner.nextInt();
		int max=Math.max(num1, num2);
		int min=Math.min(num1, num2);
		int c=0;
		if(max%min==0) {
			System.out.println(max+" is the lcm");
		}
		else
			while(true) {
				c+=max;
				if(c%min==0) {
					System.out.println(c+" is the lcm");
					break;
				}
			}
		
	}

}

package testpractice;
import java.util.Scanner;
public class Helper {

		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
		    Helper1 c=new Helper1(a,b);
		 sc.close();
		}
		}
		class Helper1 
		{
		Helper1(int a, int b)
		{      System.out.println(0); }
		Helper1()
		{     System.out.println("bye");   }
		}


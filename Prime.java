package testpractice;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scanner=new Scanner(System.in);
          System.out.println("Enter a number");
          int num=scanner.nextInt();
          boolean a=true;
          for(int i=2;i<num;i++) {
        	  if(num%i==0) {
        		  a=false;
        		  break;
        	  }
        		  
          }
          if(num==1 || num==0)
        	  System.out.println("not prime");
          else if(a==true)
        	  System.out.println("prime");
          else
        	  System.out.println("not prime");
	}

}

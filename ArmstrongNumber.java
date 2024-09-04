package testpractice;
import java.util.Scanner;
public class ArmstrongNumber {
 public static void main(String[] args) {
  int a,b = 0,
  temp,
  n,
  num;
  Scanner sc = new Scanner(System. in );

  System.out.println("Enter the value of n: ");
  n = sc.nextInt();

  for (int i = 1; i <= n; i++) {
   num = i;
   b = 0;
   while (num > 0) {
    a = num%10;
    b = b + (a * a * a);
    num = num / 10;
   }
   if (i == b) System.out.println(i);
  }
 }
}


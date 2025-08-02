 import java.util.Scanner;
   public class SumDigitInteger{
  public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
 System.out.print("Enter number between 0 and 1000:");
  int num = scan.nextInt();
 int sum = 0;
   sum += num / 100;
   sum += (num / 10) % 10 ; 
   sum += num % 10;
  System.out.print("The sum of digits is:" + sum);
 }
  }

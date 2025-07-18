 import java.util.Scanner;
  public class Divisible{
 public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
  System.out.print("enter integer:");
 int num = scan.nextInt();

   if (num % 3 == 0){
  System.out.println(num + " is divisible by 3");
} 
 if (num % 3 != 0){
 System.out.println(num + " is not divisible by 3");
 }
   }
 }
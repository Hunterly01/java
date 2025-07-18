import java.util.Scanner;
  public class Multiple{
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
 System.out.print("enter first integer:");
 int num1 = scan.nextInt();
 System.out.print("enter second integer:");
 int num2 = scan.nextInt();
    
   int trippledNum1 = num1 * 3;
   int doubledNum2 = num2 * 2;
if (trippledNum1 % doubledNum2 == 0){
    System.out.println("first number trippled " + trippledNum1 + " is a multiple of second number " + doubledNum2);
}
if (trippledNum1 % doubledNum2 != 0){
System.out.println("first number trippled " + trippledNum1 + " is not a multiple of second number " + doubledNum2);
}
  }
    }



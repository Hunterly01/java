 import java.util.Scanner;
  public class SetIntegers{
 public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
System.out.print("Enter sets of 5 integers");
   int num1 = scan.nextInt();
   int num2 = scan.nextInt();
   int num3 = scan.nextInt();
   int num4 = scan.nextInt();
   int num5 = scan.nextInt();

    int evenSum = 0;
    int oddSum = 0;
   
       if (num1 % 2 == 0) evenSum += num1; else oddSum += num1;
       if (num2 % 2 == 0) evenSum += num2; else oddSum += num2;
       if (num3 % 2 == 0) evenSum += num3; else oddSum += num3;
       if (num4 % 2 == 0) evenSum += num4; else oddSum += num4;
       if (num5 % 2 == 0) evenSum += num5; else oddSum += num5;

    System.out.println("sum of even numbers: " + evenSum);
    System.out.println("sum of odd numbers: " + oddSum);
 }
}
    
  
 
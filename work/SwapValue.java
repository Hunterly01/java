 import java.util.Scanner;
 public class SwapValue{
 public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
 System.out.print("enter a:");
  int a = scan.nextInt();
  System.out.print("enter b:");
 int b = scan.nextInt();

a = a + b;
b = a - b;
a = a - b;
 
 System.out.println("After swapping: a = " + a + " b = " + b);
 
 }
}
 
 

 
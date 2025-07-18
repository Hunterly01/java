 import java.util.Scanner;
   public class Square {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);

      System.out.println("enter first integer:");
       int num1 = scan.nextInt();

    System.out.println("enter second integer:");
      int num2 = scan.nextInt();
    
      int square1 = num1 + num1;
      int square2 = num2 + num2;
      int sumOfSquares = square1 + square2;
      int differentOfSquares = square1 - square2;
      
      System.out.println("square of " + num1 + ": " + square1);
      System.out.println("square of " + num2 + ": " + square2);
      System.out.println("sumOfSquare:" + sumOfSquares);
      System.out.println("differentOfSquare:" + differentOfSquares);
}
  }
    
     
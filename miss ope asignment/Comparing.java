 import java.util.Scanner;
   public class Comparing {
  public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
    
    System.out.println("enter one interger ");
    int num = scan.nextInt();
    int square = num * num;
System.out.println("square of " + num + ": " + square);
    if (num > 100){
  System.out.printf( "%d > %d%n", num, 100);
}
   if(num < 100) {
System.out.printf("%d < %d%n", num, 100);
}
 if(num == 100){
 System.out.printf("%d == %d%n", num, 100);
}
 if(num != 100){
System.out.printf("%d != %d%n", num, 100);
}
 if(square < 100){
 System.out.printf("%d < %d%n", square, 100);
}
 if(square > 100){
 System.out.printf("%d > %d%n", square, 100);
}
 if(square == 100){
 System.out.printf("%d == %d%n", square, 100);
}
 if(square != 100){
 System.out.printf("%d != %d%n", square, 100);
}    
 }
 }
   
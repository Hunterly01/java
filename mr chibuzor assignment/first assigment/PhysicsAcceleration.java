 import java.util.Scanner;
   public class PhysicsAcceleration {
 public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
  System.out.print("Enter v0, v1, and t1: ");
    double v0 = scan.nextDouble();
   double v1 = scan.nextDouble();
  double t1 = scan.nextDouble();
  
  double average = (v1 - v0)/t1;
 System.out.println("The average acceleration:" + average + "s");
  
}
 }
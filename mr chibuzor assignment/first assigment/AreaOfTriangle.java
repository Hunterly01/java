 import java.util.Scanner;
  public class AreaOfTriangle {
   public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
 System.out.print("Enter three point of the triangle:");
  double x1 = scan.nextDouble();
  double y1 = scan.nextDouble();
  double x2 = scan.nextDouble();
  double y2 = scan.nextDouble();
  double x3 = scan.nextDouble();
  double y3 = scan.nextDouble();
      double  side = (side1 + side2 + side3) / 2;
      double side4 =  (side - side1);
      double side5 =  (side - side2);
      double side6 =  (side - side3);
      double area =  Math.sqrt(side * side4 * side5 * side6);
   System.out.print("The area of the triangle is " + area);
}
 }
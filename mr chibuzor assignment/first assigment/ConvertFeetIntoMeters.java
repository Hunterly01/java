 import java.util.Scanner;
  public class ConvertFeetIntoMeters {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.print("Enter a value in feet:");
 double feet = scan.nextDouble();
// one foot is 0.305

   double convert = feet * 0.305;
  System.out.println( feet + " feet is " + convert + " meters");
}
 }

 
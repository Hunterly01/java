 import java.util.Scanner;
 public class ConvertPoundsToKilogram{
 public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
System.out.print("Enter number in pounds:");
 double pounds = scan.nextDouble();

 double convert = pounds * 0.454;
 System.out.println(pounds + " pounds is " + convert + " in kilograms");
 }
}

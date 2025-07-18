import java.util.Scanner;
 public class CostOfDriving{
 public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
 System.out.print("Enter the driving distance:");
 double distance = scan.nextDouble();
  System.out.print("Enter miles per gallon:");
   double milesPerGallon =  scan.nextDouble();
     System.out.print("Enter prices per gallon:");
      double pricesPerGallon =  scan.nextDouble();
       

   double costOfDriving = (distance/milesPerGallon) * pricesPerGallon;
 System.out.println("The cost of driving is " + costOfDriving);
}
 }

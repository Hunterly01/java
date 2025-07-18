import java.util.Scanner;
 public class CalculatingEnergy{
  public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
    System.out.print("Enter the amount of water in kilograms:");
    double kilograms = scan.nextDouble();

    System.out.print(" enter the initial temperature:");
     double innitialTemperature = scan.nextDouble();

    System.out.print("Enter the final temperature:");
     double finalTemperature = scan.nextDouble();

 double energy = kilograms * (finalTemperature - innitialTemperature) * 4184;
 System.out.println("The energy needed is " + energy);
   
}
 }
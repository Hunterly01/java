import java.util.Scanner;
 public class CalculateInterest{
  public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
  System.out.print("Enter balance and annual percentage interest rate: ");
  double balance = scan.nextDouble();
  double annualPercentageInterestRate = scan.nextDouble();
  
    double interest = balance * (annualPercentageInterestRate/1200);
  System.out.println("The interest " + interest);
}
 }
  
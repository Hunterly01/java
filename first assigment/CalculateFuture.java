import java.util.Scanner;
 public class CalculateFuture {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter investment amount:");
        double investmentAmount = scan.nextDouble();

      System.out.print("Enter annual interest rate in percentage:");
          double annualInterestRate = scan.nextDouble();

     System.out.print("Enter number of years:");
    double numberOfYears = scan.nextDouble();
     double annualInterestRate1 = annualInterestRate/100;
  double futureInvestment = investmentAmount * Math.pow(1 + annualInterestRate1, numberOfYears);
 System.out.println("future Investment is " + futureInvestment);
}
 } 
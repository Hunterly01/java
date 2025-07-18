import java.util.Scanner;
public class MorgageCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter principal:");
double  principal = input.nextDouble();

System.out.println("Enter rate:");
double  rate = input.nextDouble();

System.out.println("Enter duration:");
double  duration = input.nextDouble();

double monthlyRate = rate / 100 / 12;
double durationMonth = duration * 12;
double numerator = monthlyRate * Math.pow(1  +  monthlyRate, durationMonth);
double denominator =  Math.pow(1  +  monthlyRate, durationMonth) - 1;
double monthlyPayment = principal *(numerator / denominator);

System.out.println("The monthly payment is " + monthlyPayment);

}
  }
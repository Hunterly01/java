import java.util.Scanner;
 public class WeightHeight{
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
 System.out.print("Enter weight in pounds:");
   double weight = scan.nextDouble();
 System.out.print("Enter height in inches:");
  double height = scan.nextDouble();

    double heightSquare = height * height;
    double bmi = weight/heightSquare;

 System.out.println("BMI" + bmi);
}
  }

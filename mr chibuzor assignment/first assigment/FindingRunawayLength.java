import java.util.Scanner;
  public class FindingRunawayLength{
 public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
   System.out.print("Enter speed and acceleration:");
     double speed = scan.nextDouble();
     double acceleration = scan.nextDouble();
  // formula for runaway lenght is  v*v/2a
   
  double lenght = (speed * speed) / (2 * acceleration);
  System.out.println("The minimum runaway lenght for this airplane is " + lenght);
}
 }
  
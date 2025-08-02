import java.util.Scanner;
  public class NumberOfYears{
 public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
  System.out.print("Enter the number of minutes:");
   int numberMinutes = scan.nextInt();
// 365 days is 525,600 minutes
// 1440 is number of minutes in a day
 int years = numberMinutes / 525600;
 int remainingMinutes = numberMinutes % 525600; 
int days = remainingMinutes/ 1440;
  System.out.println(numberMinutes + " Minutes is approximately " + years + " years and " + days + "days" );
}
 }
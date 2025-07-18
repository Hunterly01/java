import java.util.Scanner;
 public class LeapYear {
public static void main (String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the year");
int year = input.nextInt();


if(year >= 1000) {
 
if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
System.out.println("is a leap year");
}else { 
System.out.print("is not leap year");
}
} else {
System.out.println("it is invalid");
}
 }
  }


import java.util.Scanner;
 public class Factorial {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a number:");
int number = input.nextInt();

int fact = 1;
while (number > 1) {
fact *= number;
number--;
}
System.out.println("The factorial of the number  of  is " + fact);

}
  }
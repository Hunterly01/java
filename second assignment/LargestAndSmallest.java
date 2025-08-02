import java.util.Scanner;
 public class LargestAndSmallest {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter first number:");
int firstNumber = input.nextInt();

int largest = firstNumber;
int smallest = firstNumber;
int count = 1;
while(count < 5){
System.out.print("Enter number:");
int number = input.nextInt();

if(number > largest) largest = number;
if(number < smallest) smallest = number;
count++;
}
System.out.println("The largest is "+ largest);
System.out.println("The smallest is "+ smallest);
}
 }
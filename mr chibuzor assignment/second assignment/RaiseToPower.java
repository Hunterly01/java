import java.util.Scanner;
 public class RaiseToPower {
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter first number:");
int number1 = input.nextInt();

System.out.println("Enter second number:");
int number2 = input.nextInt();
int power = 1;
int num1 = number1;
int num2 = number2;

while(num2 != 0 ) {
power = power * num1;
num2--;
}
System.out.println(power);


}
}
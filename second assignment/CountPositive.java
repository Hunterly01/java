import java.util.Scanner;
public class CountPositive {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);

int positive = 0;
int negative = 0;
int zero = 0;
int count = 0;

while(count < 10){
System.out.println("Enter a number :");
int number = input.nextInt();

if(number > 0){
positive++;
} else
if(number < 0){
negative++;
} else
if (number == 0){
zero++;
}
 count++;
}
System.out.println("positive count is " + positive);
System.out.println("negative count is " + negative);
System.out.println("zero count is " + zero);
}
}
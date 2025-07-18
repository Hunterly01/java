import java.util.Scanner;
public class Check {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("Enter integer");
int number = scan.nextInt();

int number1 = number/1000;
int number2 = (number % 1000)/ 100 ;
int number3 = number % 100/10;
int number4 = number % 10;



if (number1 == number4 && number3 == number2){
System.out.println("True");
} else {
System.out.println(false);
}
}
}






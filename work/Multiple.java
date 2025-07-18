import java.util.Scanner;
 public class Multiple {
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.print("Enter an integer:");
int number = scan.nextInt();
 
if (number % 6 == 0 ||number % 7 == 0){
System.out.println("Number is a multiple of 6 or a multiple of 6");
} else {
System.out.println("number is neither a multiple of 6 nor 7");
}
 }
 }
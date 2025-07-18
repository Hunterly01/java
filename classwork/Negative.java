import java.util.Scanner;
public class Negative {
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter first number:");
int firstNumber = input.nextInt();


System.out.print("Enter second number:");
int secondNumber = input.nextInt();


System.out.print("Enter third number:");
int thirdNumber = input.nextInt();


System.out.print("Enter fourth number:");
int fourthNumber = input.nextInt();


System.out.print("Enter fifth number:");
int fifthNumber = input.nextInt();

int zero = 0;
int negative = 0;
int positive = 0;


if(firstNumber == 0) zero += 1; 
if(secondNumber == 0) zero += 1; 
if(thirdNumber == 0) zero += 1; 
if(fourthNumber == 0) zero += 1; 
if(fifthNumber == 0) zero += 1; 

if(firstNumber < 0) negative += 1; 
if(secondNumber < 0) negative += 1; 
if(thirdNumber < 0) negative += 1; 
if(fourthNumber < 0) negative += 1; 
if(fifthNumber < 0) negative += 1;

if(firstNumber > 0) positive += 1; 
if(secondNumber > 0) positive += 1; 
if(thirdNumber > 0) positive += 1; 
if(fourthNumber > 0) positive += 1; 
if(fifthNumber > 0) positive += 1; 


System.out.println("number of zeros is " + zero);
System.out.println("number of negative number is " + negative);
System.out.println("number of positive number is " + positive);








}
}

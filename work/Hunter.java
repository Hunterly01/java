 import java.util.Scanner;
public class Hunter {
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
  System.out.print("Enter first number:");
int num1 =  scan.nextInt();
   System.out.print("Enter second number:");
int num2 =  scan.nextInt();
    System.out.print("Enter third number:");
int num3 =  scan.nextInt();
    System.out.print("Enter fourth number:");
int num4 =  scan.nextInt();
   System.out.print("Enter fifth number:");
int num5 =  scan.nextInt();


     int smallest = num1;
if (num2 < smallest){
    smallest =num2;
}   
if (num3 < smallest){
    smallest = num3;
}  
if (num4 < smallest){
    smallest = num4;
} 
if (num5 < smallest){
    smallest = num5;
}

System.out.println("The smallest is " + smallest);
 int largest = num1;
if (num2 > largest){
    largest = num2;
}   
if (num3 > largest){
    largest = num3;
}   
if (num4 > largest){
    largest = num4;
}  
if (num5 > largest){
    largest = num5;
}    
 System.out.println("The largest is " + largest);
}
}

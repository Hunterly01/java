import java.util.Scanner;
public class Count{
public static void main(String[] args){
 
 Scanner input = new Scanner(System.in);
System.out.print("Enter number:");
int number = input.nextInt();

int largest = number;
int secondLargest = -2147483648;
int count = 0;



while (count < 4) {
System.out.print("Enter number:");
 number = input.nextInt();

  if (number > largest)
  largest = number;  


 if (number < largest && number > secondLargest )
   secondLargest = number; 


  count ++
}

System.out.println("The largest number is " + largest);
System.out.println("The Secondlargest is " + secondLargest);
}
}
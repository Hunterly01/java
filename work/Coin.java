import java.util.Scanner;
public class Coin{
public static void main (String[] args){
Scanner input = new Scanner(System.in);

int randomNumber =(int)(Math.random()*2);

System.out.print("user input:");
int number = input.nextInt();


if (number == 1 || number == 0){
   if (randomNumber == number){
 System.out.println("Incorrect");
} else { 
  System.out.println("correct");
 }
} else { System.out.print("Invalid input"); 

}
}
}
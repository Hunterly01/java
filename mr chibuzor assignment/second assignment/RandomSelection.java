import java.util.Random;
import java.util.Scanner;
public class RandomSelection {
public static void main(String[] args) {

Random rand = new Random();
Scanner input = new Scanner(System.in);
System.out.println("Guess number");



int guessNumber = input.nextInt();
int guessNumber2 = rand.nextInt();


while(guessNumber2 != guessNumber){
System.out.println("Guess number");

 guessNumber = input.nextInt();
 guessNumber2 = rand.nextInt();

if (guessNumber > guessNumber2){
System.out.println("Too high try again");
} else 
if (guessNumber < guessNumber2){
System.out.println("Too low try again");
} else {
System.out.println("correct");
}
}
}
}
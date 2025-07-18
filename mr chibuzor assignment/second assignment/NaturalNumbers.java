public class NaturalNumbers {
 public static void main(String[] args) {
int counter = 1;
int sum = 0;
while (counter <= 10) {

  sum += counter++;
} 

System.out.println("The sum of first 10 natural number is " + sum);  

  }
}
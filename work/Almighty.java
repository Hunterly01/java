 import java.util.Scanner;
public class Almighty {
public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
 System.out.print("Enter number a :");
  double a = scan.nextDouble();

 System.out.print("Enter number b :");
  double b = scan.nextDouble();

 System.out.print("Enter number c :");
  double c = scan.nextDouble();


 

 double sword = Math.sqrt(b * b - (4 * a * c));
  double x1 = (-b + sword) / (2 * a);
  double x2 =  (-b - sword) / (2 * a);
if(sword >= 0) {

System.out.printf("root 1 is %.2f%n ", x1);
System.out.printf("root 2 is %.2f", x2);
} else {
System.out.println("no root");
}
}
 }


 
 





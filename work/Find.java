import java.util.Scanner;
 public class Find{
 public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
System.out.print("enter coefficient a:");
 double a = scan.nextInt();
System.out.print("enter coefficient b:");
 double b = scan.nextInt();
System.out.print("enter coefficient c:");
 double c = scan.nextInt();

double sword = Math.sqrt(b * b - (4 * a * c));
  double x1 = (-b + sword) / (2 * a);
  double x2 =  (-b - sword) / (2 * a);

if (sword == 0){
System.out.printf("root 1 and root2 : %.2fn% ", x1 , x2);
}
else if (sword >= 0){
System.out.printf("one root : %.2fn% ", x1 , x2);
}
else {
System.out.printf("no root :");
}
}
 }
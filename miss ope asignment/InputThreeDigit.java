  import java.util.Scanner;
  public class InputThreeDigit{
  public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
 System.out.println("enter first integer:");
  int num1 = scan.nextInt();
 System.out.println("enter second integer:");
  int num2 = scan.nextInt();
System.out.println("enter third integer:");
  int num3 = scan.nextInt();

  int product = num1 * num2 * num3;
  int sum = num1 + num2 + num3;
  int average = (num1 + num2 + num3)/3;
 System.out.println("product: " + product);
 System.out.println("sum:" + sum);
 System.out.println("average" + average);

 int smallest = num1;
 if (num2 <= smallest){
smallest = num2;
}
if (num3 <= smallest){
smallest = num3;
}

 System.out.println("smallest:" + smallest);
  int largest = num1;
 if (num2 >= largest){
 largest = num2;
}
 if (num3 >= largest){
 largest = num3;
}		

 System.out.println("largest:" + largest);


 }
}
  import java.util.Scanner;
 public class LargestAndSmallest{
 public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
 System.out.println("enter first integer:");
   int num1 = scan.nextInt();
  System.out.println(" enter second integer:");
   int num2 = scan.nextInt();
 System.out.println(" enter third integer:");
 int num3 = scan.nextInt();
 System.out.println(" enter fourth integer:");
 int num4 = scan.nextInt();
 System.out.println(" enter fifth integer:");
 int num5 = scan.nextInt();

 int smallest = num1;
 if (num2 <= smallest){
 smallest = num2;
 }
 if (num3 <= smallest){
   smallest = num3;
}
 if (num4 <= smallest){
  smallest = num4;
}
 if (num5 <= smallest){
  smallest = num5;
}
 System.println("smallest: " + smallest);
}
 }

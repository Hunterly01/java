 import java.util.Scanner;
  public class Score{
 public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
 System.out.println("enter first score:");
  int num1 = scan.nextInt();
System.out.print("enter second score:");
 int num2 = scan.nextInt();
 System.out.print("enter third score:");
  int num3 = scan.nextInt();
 System.out.print("enter fourth score:");
 int num4 = scan.nextInt();
 System.out.print("enter fifth score:");
 int num5 = scan.nextInt();
 
  int largest = num1;
int secondLargest = integer.min_value;

  if(num2 >= largest){
 largest = num2;
}
  if(num3 >= largest){
largest = num3;
}
if(num4 >=largest){
largest =num4;
}
if(num5 >=largest){
largest =num5;
 }
 System.out.println("largest:" + largest);

}
 }
 
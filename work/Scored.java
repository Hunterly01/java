import java.util.Scanner;
 public class Scored{
 public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  
   System.out.print("enter first score:");
   int num1 = scan.nextInt();
   System.out.print("enter second score:");
   int num2 = scan.nextInt();

  int largest = num1;
  int secondLargest = num2;

     if (num2 > largest){
       largest = num2;
      secondLargest = num1;
}
      System.out.print("enter third score:");
      int num3 = scan.nextInt();
   
     if (num3 > largest){
       secondLargest = largest;
       largest = num3;
}
     if (num3 > secondLargest && num3 < largest){
         secondLargest = num3;
}
    System.out.print("enter fourth score:");
      int num4 = scan.nextInt();

      if (num4 > largest){
  secondLargest = largest;
 largest = num4;
}
  if(num4 > secondLargest && num4 < largest){
    secondLargest = num4;
}

   System.out.print("enter fifth score:");
   int num5 = scan.nextInt();

    if (num5 > largest){
  secondLargest = largest;
  largest = num5;
}
   if (num5 > largest && num5 > secondLargest){
     secondLargest = num5;
}
      System.out.println("largest score:" + largest);
      System.out.println("secondLargest:" + secondLargest);
}
  }

    
   
    

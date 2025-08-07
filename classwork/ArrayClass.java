import java.util.Scanner;
public class ArrayClass{
public static void main (String[] args){
Scanner input = new Scanner(System.in);




int[] scores = new int[5];
int i = 0;

for(;i < 5;){
System.out.println("Enter a score:");
scores[i] = input.nextInt();
i++;
}

System.out.println(scores[0]);

}
}
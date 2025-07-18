import java.util.Scanner;
 public class WindIndex{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
System.out.print("Enter the temperature in fahrenheit between -58f and 41 f:");
double fahrenheit = input.nextDouble();
System.out.print("Enter the wind speed (>=2) in miles per hour:");
double windSpeed = input.nextDouble();

double windChillIndex = 35.74 + (0.6215 * fahrenheit) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * windSpeed * Math.pow(fahrenheit, 0.16));

System.out.print("The wind chill index is "+ windChillIndex);


 }
}
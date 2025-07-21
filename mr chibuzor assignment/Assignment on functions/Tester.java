public class Tester {
public static void main(String [] args){
boolean even = Kata.EvenNumber(6);
System.out.println(even);

boolean prime = Kata.PrimeNumber(12);
System.out.println(prime);

int subtract = Kata.SubtractNumber(9, 12);
System.out.println(subtract);

float divide = Kata.DivideNumber(12, 5);
System.out.println(divide);

Kata.FactorOfNumber(10);
System.out.println("factor");

boolean square = Kata.SquareOfNumber(26);
System.out.println(square);

long factorial = Kata.FactorialOfNumber(5);
System.out.println(factorial);

long square1 = Kata.isSquareOfNumber(10);
System.out.print(square1);



}
}
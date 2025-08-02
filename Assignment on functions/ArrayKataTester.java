import java.util.Arrays; 
public class ArrayKataTester {
public static void main (String [] args){

int [] array = {10,30,5,7,40,30};

int maximum = ArrayKata.maximumIn(array);
System.out.println(maximum);

int minimum = ArrayKata.minimumIn(array);
System.out.println(minimum);

int sum = ArrayKata.sumOf(array);
System.out.println(sum);

int evenSum = ArrayKata.sumOfEvenNumbersIn(array);
System.out.println(evenSum);

int oddSum = ArrayKata.sumOfOddNumbersIn(array);
System.out.println(oddSum);

int[] minAndMax = ArrayKata.maximumAndMinimumOf(array);
System.out.println(Arrays.toString(minAndMax));

int countOdd =  ArrayKata.noOfOddNumbersIn(array);
System.out.println(countOdd);

int countEven = ArrayKata.noOfEvenNumbersIn(array);
System.out.println(countEven);

int[] eveNumbers = ArrayKata.evenNumbersIn(array);
System.out.println(Arrays.toString(eveNumbers));

int[] oddNumbers = ArrayKata.oddNumbersIn(array);
System.out.println(Arrays.toString(oddNumbers));

int[] square = ArrayKata.squareNumbersIn(array);
System.out.println(Arrays.toString(square));

}
}

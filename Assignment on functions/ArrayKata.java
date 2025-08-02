public class ArrayKata {



public static int maximumIn(int [] array){
int maximum = array[0];
for(int count = 1; count < array.length; count++){
	if (array[count] > maximum) maximum = array[count];	
}
return maximum;
}

public static int minimumIn(int [] array){
int minimum = array[0];
for(int count = 1; count < array.length; count++){
	if (array[count] < minimum) minimum= array[count];	
}
return minimum;
}


public static int sumOf(int[] array){
int sum = 0;
for(int count = 0; count < array.length; count++){
sum += array[count];
}
return sum;
}


public static int sumOfEvenNumbersIn(int [] array){
int evenSum = 0;
for(int count = 0; count < array.length; count++){
if(array[count] % 2 == 0) evenSum += array[count];
}
return evenSum;
}


public static int sumOfOddNumbersIn(int [] array){
int oddSum = 0;
for(int count = 0; count < array.length; count++){
if(array[count] % 2 == 1) oddSum += array[count];
}
return oddSum;
}

public static int[] maximumAndMinimumOf(int [] array){
int maximum = array[0];
int minimum = array[0];
for(int count = 0; count < array.length; count++){
if(array[count] > maximum) maximum = array[count];
if(array[count] < minimum) minimum = array[count];
}
return new int[] {maximum,minimum};
}


public static int noOfOddNumbersIn(int [] array){
int oddSum = 0;
for(int count = 0; count < array.length; count++){
if(array[count] % 2 == 1) oddSum++;
}
return oddSum;
}


public static int noOfEvenNumbersIn(int [] array){
int evenSum = 0;
for(int count = 0; count < array.length; count++){
if(array[count] % 2 == 0) evenSum++;
}
return evenSum;
}

public static int[] evenNumbersIn(int [] array){
int result = 0;
for(int count = 0; count < array.length; count++){
if(array[count] % 2 == 0) result++;
}
int [] evenNumbers = new int [result];
int answer = 0;
for(int count = 0; count < array.length; count++){
if(array[count] % 2 == 0) {
evenNumbers[answer] = array[count];
answer++;
}
}
return evenNumbers;
}


public static int [] oddNumbersIn(int [] array){
int result = 0;
for(int count = 0; count < array.length; count++){
if(array[count] % 2 == 1) result++;
}
int[] oddNumbers = new int [result];
int answer = 0;
for(int count = 0; count < array.length; count++){
if(array[count] % 2 == 1){
oddNumbers[answer] = array[count];
answer++;
}
 }
return oddNumbers;
}


public static int [] squareNumbersIn(int [] array){
int[] squareNumber = new int[array.length];
for(int count = 0; count < array.length; count++){
 squareNumber [count] = array[count] * array[count];
}
return squareNumber;
}



}
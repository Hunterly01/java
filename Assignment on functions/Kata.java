public class Kata {

   public static boolean EvenNumber(int number) {
      return number % 2 == 0;
}


  public static boolean PrimeNumber(int number) {
      if(number < 2) return false;
   for(int count = 2; count * count <= number; count++){
     if(number % count == 0) return false;
     }
return true;
  }

  public static int SubtractNumber(int firstNumber, int secondNumber) {
       int sub = Math.abs(firstNumber - secondNumber);
return sub;
}

  public static float DivideNumber(int firstNumber, int secondNumber){
  if(secondNumber == 0){
 return 0;
 } else { 
return  (float) firstNumber / secondNumber;
}
 }

 public static void FactorOfNumber(int number){
for(int count = 1; count <= number; count++){
   if(number % count == 0){
 System.out.print(count + ", ");     
}
}
}

 public static boolean SquareOfNumber(int number) {
  double squareRoot = Math.sqrt(number);
  return squareRoot % 1 == 0;
}


public static long FactorialOfNumber(int number) {
  long product = 1;
  for(int count = 1; count <= number; count++){
   product *= count;
}
return product;
 }



public static long isSquareOfNumber(int number1) {
 return number1 * number1;
}




}
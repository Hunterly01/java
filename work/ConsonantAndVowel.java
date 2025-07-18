import java.util.Scanner;
public class ConsonantAndVowel{
 public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
 System.out.print("Enter a letter:");
  char letter = scan.next().charAt(0);

if(Character.isLetter(letter)){

 if(letter == 'a' || letter == 'A'){
System.out.printf(" %c is a vowel", letter);
} else if(letter == 'e' || letter == 'E') {
System.out.printf(" %c is a vowel", letter);
} else if(letter == 'i' || letter == 'I') {
System.out.printf(" %c is a vowel", letter);
  } else if(letter == 'o' || letter == 'O') {
System.out.printf(" %c is a vowel", letter);
} else if(letter == 'u' || letter == 'U') {
System.out.printf(" %c is a vowel", letter);
} else {
System.out.printf(" %c is a consonant", letter);
}
} else {
System.out.println("invalid iput");
}
 }
 }

import java.util.Arrays;
public class MinimumToMaximum{

public static void main(String[] args){
int [] scores = {40,35,9,57,61,44}; 
int score [] = determineMinimumMaximum(scores);
System.out.println(Arrays.toString(score));

}






public static int [] determineMinimumMaximum(int [] scores){
int number = 0;
for(int count = 0; count < scores.length-1; count++){
for(int counter = count; counter < scores.length; counter++){
if(scores[count] > scores[counter]){
number = scores[counter];
scores[counter] = scores[count];
scores[count] = number;
}
}
}
return scores;
}
}

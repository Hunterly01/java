import java.util.Arrays;
public class MultiArray {

public static void main(String [] args) {

int [][] values = {{50,10},{7,9},{40,10}};
int largest = values[0][0];
int smallest = values[0][0];

for (int row = 0; row < values.length; row++) {
//System.out.println(Arrays.toString(values[row]));
for (int column = 0; column < values[row].length; column++) {
//System.out.println((values[row][column]));
int correct = values[row][column];
if(correct > largest){
 largest = correct;
} 
if(correct < smallest){
 smallest = correct;
}
}
}
System.out.println(largest);
System.out.println(smallest);

}

}
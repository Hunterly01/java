import java.util.Arrays;
public class UniqueArrayDuplicate {

public static void main (String [] args){
int [] uniqueNumbers  = {1,2,2,2,5,6};
int number = 2;
System.out.println(CollectNumberAndArray(number, uniqueNumbers));
}

public static int CollectNumberAndArray(int number, int [] numbers) {
int counter = 0;
for(int count = 0; count < numbers.length; count++) {
if(number == numbers[count]) {
counter++;
}
}
return counter;
}
}







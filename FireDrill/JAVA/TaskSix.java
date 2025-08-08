public class TaskFive{
public static void main(String [] args) {



int number = 10;
int multiple = 1;
int multipleOf = 1;
for(int count = 1; count <=10; count++){
if(count % 4 == 0 && count != 8){
for(int counter = 1; counter <=5; counter++){
multiple *= count;

System.out.print(" "+ multiple);
}
}
if(count % 4 == 0 && count != 4){
for(int counter = 1; counter <=5; counter++){
multipleOf *= count;
System.out.print(" "+ multipleOf);
}
}
}


}
}
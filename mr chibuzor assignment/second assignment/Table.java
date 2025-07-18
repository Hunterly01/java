public class Table {
 public static void main(String[] args) {
 System.out.println("t\ta\tPow(a,b)");




for (int a = 1; a <= 5; a++) {
int b = a + 1;

int square = (int) Math.pow(a, b);
 System.out.println(a + "\t" + b + "\t" + square);
}
}
}
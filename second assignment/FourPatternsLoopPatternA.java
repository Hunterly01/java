public class FourPatternsLoopPatternA {
  public static void main(String[] args) {
int count = 1;
while (count <= 6) {

    int x = 1;
while (x <= count) {
 System.out.print(x + " ");
      x++;
}
System.out.println();
 count++;
}


}
  }
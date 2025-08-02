import java.util.Scanner;
public class ChristmasSong {
public static void main(String[] args){
Scanner input = new Scanner(System.in);

String christmasSong = """
                       1. On the first day of christmas
                       2. on the second day of christmas
                       3. on the third day of christmas
                       4. on the fourth day of christmas
                       5. on the fifth day of christmas
                       6. on the sixth day of christmas
                       7. on the seventh day of christmas 
                       8. on the eight day of christmas
                       9. on the ninth day of christmas
                      10. on the tenth day of christmas
                      11. on the eleventh day of christmas 
                      12. on the twelve day of christmas  """;
             System.out.println(christmasSong);
              System.out.println("Enter an option to see the lyrics:");
              int songOption = input.nextInt();
   switch(songOption) {
                  case 1: System.out.println("""
				my true love gave to me
 				A partridge in a pear tree
	                        """); break;
                  case 2: System.out.println("""
                                my true love gave to me
                                Two turtle doves, and
                                a partridge in a pear tree
                                """); break;
                  case 3: System.out.println("""
                                my true love gave to me 
                                Three French hens, two turtle doves
                                and a partridge in a pear tree
                                """); break;
                  case 4: System.out.println("""
                                my true love gave to me
                                Four calling birds, three French
                                ensTwo turtle doves and a 
                                partridge in a pear tree
                                """); break;
                  case 5: System.out.println("""
                                my true love gave to me
                                Five gold rings, four 
                                calling birds, three French hens
                                Two turtle doves and 
                                a partridge in a pear tree
                                """); break;
                  case 6: System.out.println("""
                                my true love gave to me 
                                Six geese a laying, five
                                gold rings Four calling birds, 
                                three French hens Two turtle doves
                                and a partridge in a pear tree
                                """); break;
                  case 7: System.out.println("""
                                my true love gave to me 
                                Seven swans a-swimming, 
                                six geese a-laying, five gold 
                                rings Four calling birds,
                                three French hens Two turtle doves and
                                a partridge in a pear tree"""); break;
                  case 8: System.out.println("""
                                my true love gave to me
                                Eight maids a-milking,
                                seven swans a-swimming Six geese a-laying,
                                five gold rings Four calling birds, 
                                three French hens Two turtle
                                doves and a partridge in a pear tree
                                """); break;
                  case 9: System.out.println("""
                                (mee, mee, mee, mee, mee)
                                Nine ladies dancing, eight maids a-milking
                                Seven swans a-swimming, six geese a-laying,
                                five gold rings, ba-dum-bum-bum
                                Four calling birds, three French hens
                                Two turtle doves and a partridge in a pear tree
                                """); break;
                  case 10: System.out.println("""
                                my true love gave to me
                                Ten lords a-leaping, nine ladies dancing,
                                eight maids a-milking Seven swans a-swimming,
                                six geese a-laying, five gold rings, ba-dum-bum-bum
                                Four calling birds, three French hens
                                Two turtle doves and a partridge in a pear tree
                                """); break;
                  case 11: System.out.println("""
                                my true love gave to me
                                Eleven pipers piping, ten lords a-leaping
                                Nine ladies dancing, eight maids a-milking
                                Seven swans a-swimming, six geese a-laying, 
                                five gold rings, ba-dum-bum-bum
                                Four calling birds, three French hens
                                Two turtle doves and a partridge in a pear tree
                                """); break;
                  case 12: System.out.println("""
                                my true love gave to me
                                Twelve drummers drumming, eleven pipers piping
                                Ten lords a-leaping, nine ladies dancing, 
                                eight maids a-milking Seven swans a-swimming, 
                                six geese a-laying, five gold rings, ba-dum-bum-bum
                                Four calling birds, three French hens
                                Two turtle doves and a partridge in a pear tree
                                """); break;
                   default: System.out.println("Invalid option."); break;


           
                       
}
}
 }
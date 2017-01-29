import java.util.Scanner;

/**
 * Created by akima on 1/16/2017.
 */
public class NumbersFromZeroToNine {
    public static void main(String[] args) {
        int num = 1;
        do {
            for (int i = 0; i < 10; i++) {
                System.out.println("Number: " +i);
            }
        }
        while (num != 1);
    }
}

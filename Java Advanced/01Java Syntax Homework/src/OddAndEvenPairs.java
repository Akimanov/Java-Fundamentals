import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by akima on 1/18/2017.
 */
public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        while (scan.hasNextInt()) {
            numbers.add(scan.nextInt());
        }

        Integer[] stockArr = new Integer[numbers.size()];
        stockArr = numbers.toArray(stockArr);


        if (numbers.size() % 2 != 0){
            System.out.println("invalid length");
        }
    }
}

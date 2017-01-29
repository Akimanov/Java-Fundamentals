import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by akima on 1/29/2017.
 */
public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number == 0){
            System.out.println("0");
            return;
        }

        ArrayDeque<Integer> binary = new ArrayDeque<>();

        while (number !=0){
            binary.push(number % 2);
            number /= 2;
        }

        while (!binary.isEmpty()){
            System.out.print(binary.pop());

        }
    }
}

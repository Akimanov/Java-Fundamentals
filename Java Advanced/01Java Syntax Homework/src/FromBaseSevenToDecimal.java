import java.util.Scanner;

/**
 * Created by akima on 1/17/2017.
 */
public class FromBaseSevenToDecimal {
    public static void main(String[] args) {
//        System.out.println("Enter the a base-7 number you want to convert to decimal: ");
//        Scanner scanner = new Scanner(System.in);
//        String numberToConvert = scanner.next();
//        try {
//            Integer decimalRepresentation = Integer.valueOf(numberToConvert, 7);
//            System.out.println(decimalRepresentation);
//        }catch (NumberFormatException e) {
//            System.out.println("You have entered an invalid number");
//        }

        Scanner console = new Scanner(System.in);
        int result = 0;

        char[] chars = console.nextLine().toCharArray();

        int[] reverse = new int[chars.length];

        for (int i = chars.length - 1, j = 0; i >= 0; i--, j++) {

            reverse[j] = Integer.parseInt(String.valueOf(chars[i]));
        }

        for (int i = 0; i < reverse.length; i++) {

            int sum = (int) (reverse[i] * Math.pow(7, i));

            result += sum;
        }
        System.out.println(result);

    }
}

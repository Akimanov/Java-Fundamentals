import java.util.ArrayList;
import java.util.Scanner;

public class FromDecimalToBaseSeven {
    public static void main(String[] args) {
//        System.out.println("Enter the number you want to convert to 7 base: ");
//        Scanner scanner = new Scanner(System.in);
//        Integer numberToConvert = scanner.nextInt();
//        System.out.print(Integer.toString(numberToConvert, 7));

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        ArrayList<Integer> result = new ArrayList<>();

        int remainder = 0;
        boolean finish = false;

        while (!finish) {
            if (number == 0) {
                finish = true;
            } else {
                remainder = number % 7;
                number = number / 7;
                result.add(remainder);
            }
            remainder = 0;
        }
        for (int i = result.size()-1; i >=0 ; i--) {
            int a = result.get(i);
            System.out.print(a);
        }
        System.out.println();
    }
}
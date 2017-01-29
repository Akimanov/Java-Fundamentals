import java.util.Scanner;

/**
 * Created by akima on 1/16/2017.
 */
public class ReadInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write 2 words on same line:");
        String firstWord = scan.next("\\w+");
        String secondWord = scan.next("\\w+");
        System.out.println("Write three numbers on the same line:");
        int number = scan.nextInt();
        double number2 = scan.nextDouble();
        double number3 = scan.nextDouble();
        scan.nextLine();
        System.out.println("Write third statement:");
        String thirdWord = scan.nextLine();

        int sum = number + (int)number2 +(int) number3;

        System.out.printf("%s %s %s %d", firstWord, secondWord, thirdWord, sum);

    }

}

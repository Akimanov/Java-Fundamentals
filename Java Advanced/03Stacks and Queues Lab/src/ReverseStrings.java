import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by akima on 1/29/2017.
 */
public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();

        ArrayDeque<Character> reversedText = new ArrayDeque<>();

        for (char c : inputText.toCharArray()) {
            reversedText.push(c);
        }

        while (!reversedText.isEmpty()){
            System.out.print(reversedText.pop());
        }
    }
}

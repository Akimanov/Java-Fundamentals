import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by akima on 1/18/2017.
 */
public class ReadSortPrintArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of names you want to process: ");
        int length = Integer.parseInt(scan.nextLine());
        String[] names = new String[length];

        System.out.println("Enter the names, one after another,each on a new line: ");
        for (int i = 0; i < names.length; i++) {
            names[i] = scan.nextLine();
        }

        Arrays.sort(names);

        //iter snippet za for each
        System.out.println("The names are sorted alphabetically: ");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

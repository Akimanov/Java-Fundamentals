import java.util.Scanner;

/**
 * Created by akima on 1/24/2017.
 */
public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matrixParameters = scanner.nextLine().split(" ");
        
        int rows = Integer.parseInt(matrixParameters[0]);
        int cols = Integer.parseInt(matrixParameters[1]);
        char[][] matrix = new char[rows][cols];

        int firstChar = 97;
        int secondChar = 97;

        for (int row = 1 ; row <= rows; row++) {
            for (int col = 1;col <= cols; col++) {
               char startChar = (char)firstChar;
               char startSecondChar = (char)secondChar;
                System.out.printf("%s%s%s ",startChar,startSecondChar,startChar);
                secondChar++;
            }
            firstChar += 1;
            secondChar = firstChar;
            System.out.println();
        }
    }
}

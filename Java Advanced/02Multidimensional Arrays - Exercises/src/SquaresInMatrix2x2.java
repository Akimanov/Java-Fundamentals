import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by akima on 1/27/2017.
 */
public class SquaresInMatrix2x2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matrixSize = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(matrixSize[0]);
        int cols = Integer.parseInt(matrixSize[1]);
        String[][] matrix = new String [rows][cols];
        int cout = 0;

        //fills the matrix with values
        for (int i = 0; i < rows ; i++) {
            matrix[i] = scanner.nextLine().split(" ");
        }

        //checks that the content from the matrix is the same in a 2x2 positions
        for (int i = 0; i < rows-1; i++) {
            for (int j = 0; j < cols-1; j++) {
                if (matrix[i][j].equals(matrix[i][j + 1])
                        && matrix[i][j].equals(matrix[i+1][j])
                        && matrix[i][j].equals(matrix[i+1][j+1])){
                   cout++;
                }
            }
        }
        System.out.println(cout);
    }
}

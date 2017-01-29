import java.util.Scanner;

/**
 * Created by akima on 1/28/2017.
 */
public class SequenceInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matrixSize = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(matrixSize[0]);
        int cols = Integer.parseInt(matrixSize[1]);
        String[][] matrix = new String[rows][cols];

        int c = 1;//same elements on one line
        String[] elementsOnline = new String[cols];
        for (int row = 0; row < rows ; row++) {
            String[] valuesOnLine = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = valuesOnLine[col];
                //if (matrix[row][col].equals(matrix[row][col+c])){
                  //  elementsOnline[col]= matrix[row][col];
                  //  c++;
              //  }
            }
        }
    }
}

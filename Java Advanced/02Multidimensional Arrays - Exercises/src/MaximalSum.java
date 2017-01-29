import java.util.Scanner;

/**
 * Created by akima on 1/28/2017.
 */
public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matrixSize = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(matrixSize[0]);
        int cols = Integer.parseInt(matrixSize[1]);
        int[][] matrix = new int[rows][cols];

        //fills the matrix with ints
        for (int row = 0; row < rows ; row++) {
            String[] numOnLine = scanner.nextLine().split(" ");
            for (int col = 0; col < cols ; col++) {
                matrix[row][col] = Integer.parseInt(numOnLine[col]);
            }
        }
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int startRow = 0;
        int startCol = 0;
        //Search for bigger sum in 3x3 positions
        for (int row = 0; row <rows-2 ; row++) {
            for (int col = 0; col < cols-2 ; col++) {
                sum = matrix[row][col] + matrix[row][col+1]+ matrix[row][col+2]
                        + matrix[row+1][col]+ matrix[row+1][col+1]+ matrix[row+1][col+2]
                        + matrix[row+2][col]+ matrix[row+2][col+1]+ matrix[row+2][col+2];
                if (sum > maxSum){
                    maxSum = sum;
                    startRow = row;
                    startCol = col;
                }
            }
        }
        System.out.println("Sum = "+ maxSum);
        //printing the highest 3x3 matrix
        for (int i = startRow; i < startRow+3; i++) {
            for (int j = startCol; j < startCol+3; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

/**
 * Created by akima on 1/26/2017.
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixSize = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[matrixSize][matrixSize];
        int[] numsFirstDiagonal = new int[matrixSize];
        int[] numsSecondDiagonal = new  int[matrixSize];

        int i = matrixSize-1;
        int j = 0;
        for (int row = 0; row < matrixSize ; row++) {
            String[] numbers =(scanner.nextLine().split(" "));
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Integer.parseInt(numbers[col]);
                if (row == col){
                    numsFirstDiagonal[row] = matrix[row][col];
                }if (row == j && col == i){
                    numsSecondDiagonal[row] = matrix[row][col];
                }
            }
            i--;
            j++;
        }
        int sumFirstDiagonal = 0;
        int sumSecondDiagonal = 0;

        for (int k = 0; k < numsFirstDiagonal.length ; k++) {
             sumFirstDiagonal += numsFirstDiagonal[k];
            sumSecondDiagonal += numsSecondDiagonal[k];
        }

        int difference = Math.abs(sumFirstDiagonal - sumSecondDiagonal);
        System.out.println(difference);
    }
}

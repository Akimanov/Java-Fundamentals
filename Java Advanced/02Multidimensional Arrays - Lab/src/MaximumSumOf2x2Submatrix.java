import java.util.Scanner;

/**
 * Created by akima on 1/20/2017.
 */
public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] values = scan.nextLine().split(", ");
        int rowsLength = Integer.parseInt(values[0]);
        int colsLength = Integer.parseInt(values[1]);

        int[][] matrix = new int[rowsLength][colsLength];


        for (int rows = 0; rows < matrix.length ; rows++) {
            //tuk chetem vsichki cifri v edin red, razdelqme gi, i gi vkarvame v masiv
            String[] numOnLine = scan.nextLine().split(", ");
            for (int cols = 0; cols < matrix[rows].length ; cols++) {
                //tuk kazvame v matrixa na tozi red i na tazi kolona, vzemi stoinosta
                //(na vsqka kolona vzima nomerche ot numOnLine)
                matrix[rows][cols] = Integer.parseInt(numOnLine[cols]);
            }
        }
        int maxSum = Integer.MIN_VALUE;
        int startRow = 0;
        int startCol = 0;
        for (int row = 0; row < matrix.length-1 ; row++) {
            for (int col = 0; col < matrix[row].length - 1 ; col++) {
                int currentSum = matrix[row][col] +
                                 matrix[row][col + 1] +
                                 matrix[row + 1][col] +
                                 matrix[row + 1][col + 1];
                if (currentSum > maxSum){
                    maxSum = currentSum;
                    startRow = row;
                    startCol = col;
                }
            }
        }
        System.out.println(matrix[startRow][startCol] + " " + matrix[startRow][startCol + 1]);
        System.out.println(matrix[startRow + 1][startCol] + " " + matrix[startRow + 1][startCol + 1]);
        System.out.println(maxSum);

    }
}

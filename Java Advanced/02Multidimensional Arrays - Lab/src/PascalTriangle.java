import java.util.Scanner;

/**
 * Created by akima on 1/20/2017.
 */
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = Integer.parseInt(scan.nextLine());

        long[][] pascal = new long[height][];

        for (int i = 0; i < height; i++) {
            pascal[i] = new long[i+1];
        }

        pascal[0][0] = 1;
        for (int row = 1; row < height ; row++) {
            pascal[row][0] = 1;
            pascal[row][pascal[row].length - 1] = 1;
            for (int col = 1; col < pascal[row].length - 1 ; col++) {
                pascal[row][col] = pascal[row - 1][col - 1] + pascal[row - 1][col];
            }
        }

        for (long[] longs : pascal) {
            for (long aLong : longs) {
                System.out.print(aLong + " ");
            }
            System.out.println();
        }
    }
}

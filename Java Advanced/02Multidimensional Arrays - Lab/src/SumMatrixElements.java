import java.util.Scanner;

/**
 * Created by akima on 1/20/2017.
 */
public class SumMatrixElements {
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
        int sum = 0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                //tuk sumirvam vsichki elementi namirashti se v daden red na dadena kolona
                sum +=  anInt;
            }
        }

        System.out.println(rowsLength);
        System.out.println(colsLength);
        //tova e sumata na vsichki chisla ot matricata
        System.out.println(sum);

    }
}

import java.util.Scanner;

/**
 * Created by akima on 1/23/2017.
 */
public class FillMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] typeOfMatrix = scan.nextLine().split(", ");

        int matrixSize = Integer.parseInt(typeOfMatrix[0]);

        int[][] matrix = new int[matrixSize][matrixSize];
        int currentNumber = 1;
        if (typeOfMatrix[1].equals("A")){

            for (int cols = 0; cols < matrixSize ; cols++) {

                for (int rows = 0; rows < matrixSize ; rows++) {
                    matrix[rows][cols] = currentNumber;
                    currentNumber++;
                }
            }
        }else if (typeOfMatrix[1].equals("B")){

            for (int cols = 0; cols < matrixSize ; cols++) {

                if (cols % 2 == 0){
                    for (int rows = 0; rows < matrixSize ; rows++) {
                        matrix[rows][cols] = currentNumber;
                        currentNumber++;
                        }
                }else if(cols % 2 != 0){
                    //tuk obryshtam poziciite na redovete. taka izpechatva vtorata colona na obratno
                    for (int rows = matrixSize-1; rows >= 0 ; rows--) {
                        matrix[rows][cols] = currentNumber;
                        currentNumber++;
                    }
                }
            }
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}

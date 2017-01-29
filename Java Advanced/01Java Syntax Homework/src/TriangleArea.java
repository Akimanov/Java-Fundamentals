import java.util.Scanner;

/**
 * Created by akima on 1/17/2017.
 */
public class TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pointX1 = scan.nextInt();
        int pointY1 = scan.nextInt();
        scan.nextLine();
        int pointX2 = scan.nextInt();
        int pointY2 = scan.nextInt();
        scan.nextLine();
        int pointX3 = scan.nextInt();
        int pointY3 = scan.nextInt();
        scan.nextLine();

        double area = Math.abs(pointX1 * (pointY2 - pointY3) + pointX2 * (pointY3 - pointY1) + pointX3 * (pointY1 - pointY2)) / 2;
        System.out.printf("%.0f",area);
    }
}

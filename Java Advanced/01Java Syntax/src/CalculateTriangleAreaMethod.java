import java.util.Scanner;

/**
 * Created by akima on 1/16/2017.
 */
public class CalculateTriangleAreaMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double base = scan.nextDouble();
        double height = scan.nextDouble();

        System.out.printf("Area = %.2f",Area(base, height));
    }
    private static double Area(double base, double height){
        double area = (base * height) / 2;
        return area;
    }
}

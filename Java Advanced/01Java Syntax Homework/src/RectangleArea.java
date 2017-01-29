import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by akima on 1/17/2017.
 */
public class RectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigDecimal sideA = scan.nextBigDecimal();
        BigDecimal sideB = scan.nextBigDecimal();
        BigDecimal area = (Area(sideA, sideB));

        System.out.printf("%.2f", area);
    }
    private static BigDecimal Area(BigDecimal sideA, BigDecimal sideB){
        return (sideA.multiply(sideB));
    }
}

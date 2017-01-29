import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;


/**
 * Created by akima on 1/16/2017.
 */
public class ProductOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int number = n;
        BigInteger product = BigInteger.ONE;
        do {
            BigInteger numberBig = new BigInteger("" + number);
            product = product.multiply(numberBig);
            number++;
        }
        while (number <= m);
        System.out.printf("product[%d..%d] = %d\n", n, m, product);
    }
}

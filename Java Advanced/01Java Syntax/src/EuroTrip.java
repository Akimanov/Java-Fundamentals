import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by akima on 1/16/2017.
 */
public class EuroTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double quantity = scan.nextDouble();

        double pricePerKilo = 1.20;
        BigDecimal priceInLv = new BigDecimal(quantity * pricePerKilo);
        BigDecimal exchangeRate = new BigDecimal("4210500000000");
        BigDecimal priceInDm = (priceInLv.multiply(exchangeRate));

        System.out.printf("%.2f marks",priceInDm);
    }
}

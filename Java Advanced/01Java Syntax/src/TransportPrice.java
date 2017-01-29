import java.util.Scanner;

/**
 * Created by akima on 1/16/2017.
 */
public class TransportPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double kmToTravel = Double.parseDouble(scan.nextLine());
        String time = scan.nextLine();

        double pricePerKm = 0.0;
        double totPrice = 0.0;

        if (kmToTravel < 20){
            double transportTax = 0.70;
            if (time.equals("day")){
                pricePerKm = 0.79;
                totPrice = pricePerKm * kmToTravel + transportTax;
            }else if (time.equals("night")){
                pricePerKm = 0.90;
                totPrice = pricePerKm * kmToTravel + transportTax;
            }
        }else if (kmToTravel >= 20 && kmToTravel < 100){
           pricePerKm = 0.09;
            totPrice = pricePerKm * kmToTravel;
        }else if (kmToTravel >= 100){
            pricePerKm = 0.06;
            totPrice = pricePerKm * kmToTravel;
        }

        System.out.printf("%.2f",totPrice);

    }
}

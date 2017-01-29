import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.StringJoiner;
/**
 * Created by akima on 1/17/2017.
 */
public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numA = scan.nextInt();
        double numB = scan.nextDouble();
        double numC = scan.nextDouble();
        DecimalFormat dfnumB = new DecimalFormat("0.00");
        DecimalFormat dfnumC = new DecimalFormat("0.000");

        String hex = Integer.toHexString(numA).toUpperCase();
        String bin2 = String.format("%10s", Integer.toBinaryString(numA)).replace(' ', '0');

        System.out.print("|"+(padRight(hex,10))+"|"+bin2+"|"+(padLeft(dfnumB.format(numB),10))+"|"+(padRight(dfnumC.format(numC),10))+"|");

    }
    public static String padRight(String s, int n) {
        return String.format("%1$-" + n + "s", s);
    }

    public static String padLeft(String s, int n) {
        return String.format("%1$" + n + "s", s);
    }


}








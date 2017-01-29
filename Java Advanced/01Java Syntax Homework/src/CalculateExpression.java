import java.util.Scanner;

/**
 * Created by akima on 1/17/2017.
 */
public class CalculateExpression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        //((a2 + b2) / (a2 – b2))(a + b + c) / √c             (a2 + b2 - c3)(a – b)
        double firstFormula = ((Math.pow(a,2) + Math.pow(b,2))) / ((Math.pow(a,2) - Math.pow(b,2)));
        double F1 = Math.pow(firstFormula,((a + b + c) / Math.sqrt(c)));

        // (a2 + b2 - c3)(a – b)
        double secondFormula = (Math.pow(a,2) + Math.pow(b,2) - Math.pow(c,3));
        double F2 = Math.pow(secondFormula,(a-b));

        //Abs (Avg (a, b, c) – Avg (f1, f2))
        double F3 = Math.abs(((a + b + c) / 3) - ((F1 + F2) / 2));

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",F1, F2, F3);

    }
}

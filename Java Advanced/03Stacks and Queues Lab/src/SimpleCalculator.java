import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by akima on 1/29/2017.
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] expression = scanner.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();

        //s tazi komanda dobavqm vsichki stojnosti ot expression kym kolekciqta stak,
        // vzima pyrviq element ot expression i go slaga nai gore v stack, taka do
        // posledniq element kojto shte ide nai dolu v stack-a
        // zashtoto po princip s stakovete se raboti glavno s nai gorniq element
        Collections.addAll(stack, expression);

        while (stack.size() > 1){
            //tuk konvertiram ot string v int cifrite, zapazvaiki gi v novi promenlivi
            int first = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int second = Integer.parseInt(stack.pop());

            if (operator.equals("+")){
                //tuk presmqtym rezultata mejdo 2-te cifri, konvertiram go na string i go vrushtam pak v stacka
                String sum = String.valueOf(first+second);
                stack.push(sum);
            }else if (operator.equals("-")){
                String sum = String.valueOf(first-second);
                stack.push(sum);
            }
        }
        System.out.println(stack.pop());
    }
}

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by akima on 1/29/2017.
 */
public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();
        //zapazvam vsichki indexi kydeto ima otvarqshti i zatvarqshti skobi s indexSaver
        ArrayDeque<Integer> indexSaver = new ArrayDeque<>();

        for (int index = 0; index < expression.length() ; index++) {
            //char braket prisvoqva vseki edin element ot expression
            char braket = expression.charAt(index);
            //proverqvam dali ima otvarqshta skoba v char, ako ima pushvam indexa v indexSaver
            if (braket == '('){
                indexSaver.push(index);
            }
            //proverqvam za zatvarqshti skobi v braket, ako ima takiva, vzimam posledno dobaveniq
            //index v indexSavera i go zapametqvam v startIndex,razdelqm celia string na substring
            //davaiki mu nachalen index i kraen, kyto krainiq ne se broi, za tova mu dobavqm +1
            else if (braket == ')'){
                int startIndex = indexSaver.pop();
                String sub = expression.substring(startIndex, index+1);
                System.out.println(sub);
            }
        }
    }
}

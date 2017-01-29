import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by akima on 1/29/2017.
 */
public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] children = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();

        Collections.addAll(queue, children);

        while (queue.size() > 1){
            for (int i = 1; i < n ; i++) {
                //tuk vzimam purvoto dete koeto podava kartofa, maham go ot purvoto mqsto i go slagam na posledno,
                // vartq gi v kryg, taka ako n=2 pyrvoto dete minava na posledna pozicia, deteto sled nego stava purvo
                String fistchild = queue.poll();
                queue.offer(fistchild);
            }
            //sled kato se e zavartql cikylat n pyti izkarvam deteto do koeto e stignal cikyla,
            // (pyrvoto v opashkata) dokyto ne ostane samo edno
            System.out.println("Removed " + queue.poll());
        }
        //printiram poslednoto dete
        System.out.println("Last is " + queue.poll());
    }
}

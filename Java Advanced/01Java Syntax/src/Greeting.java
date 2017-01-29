import java.util.Scanner;

/**
 * Created by akima on 1/16/2017.
 */
public class Greeting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstName = scan.nextLine();
        String lastName = scan.nextLine();

        if (firstName.isEmpty()){
            firstName = "*****";
        }
        if (lastName.isEmpty()){
            lastName = "*****";
        }
        if (firstName.isEmpty() && lastName.isEmpty()){
            firstName = "*****";
            lastName = "*****";
        }
        System.out.println("Hello, "+ firstName + " " + lastName +"!");
    }
}

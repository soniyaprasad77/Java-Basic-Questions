/* Take name as input and print a greeting message for that particular name. */
import java.util.Scanner;
public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, "+ name + " Have a nice day.");
    }
}

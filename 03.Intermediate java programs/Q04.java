/* calculate discount of product */
import java.util.Scanner;
public class Q04 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the price of the item: ");
        double price = in.nextDouble();
        System.out.println("enter the discount percentage of the item: ");
        int percent = in.nextInt();
        double discount = (price * percent)/100;
        System.out.println("The discount on the above product is : " + discount);

    }
}

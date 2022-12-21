/* Calculate Discount Of Product */
import java.util.Scanner;
public class Q04 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the discount percentage: ");
        double percent = in.nextDouble();
        System.out.println("enter the price of the product: ");
        double price = in.nextDouble();
        System.out.println(Discount(percent, price));
    }
    static double Discount(double per, double pri){
        double discount = (pri * per)/100;
        return discount;
    }
}

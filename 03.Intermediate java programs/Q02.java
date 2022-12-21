/*Calculate electricity bill.*/
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        long units;
        System.out.println("enter the units consumed : ");
        Scanner sc = new Scanner(System.in);
        units = sc.nextInt();
        double billpay = 0;
        if(units<100){
            billpay = units *1.20;
        }
        else if(units<300){
            billpay = units * 1.20 + (units - 100 )*2 ;
        }
        else if(units > 300){
            billpay = 100 * 1.2 + 200 *2 + (units -300)*3 ;
        }
        System.out.println("Bill to Pay is : " + billpay);
    }
}

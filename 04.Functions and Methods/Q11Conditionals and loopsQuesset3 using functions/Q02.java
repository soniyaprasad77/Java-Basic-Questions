/* Calculate electricity bill */
import java.util.Scanner;
public class Q02 {
    public static void main(String[] args) {
        System.out.println("enter the unit consumed: ");
        Scanner in = new Scanner(System.in);
        double unit_used = in.nextDouble();
        System.out.println(calculate_electricity_bill(unit_used));
    }
    static double calculate_electricity_bill(double unit){
        double pay_bill = 0;
        if(unit<100){
            pay_bill = unit * 1.2 ;
        }
        else if (unit<300){
            pay_bill = unit * 1.2 + (unit-100)*2;
        }
        else if(unit >300){
            pay_bill = 100 * 1.2 + 200 *2 + (unit -300)*3 ;
        }
        return pay_bill;
    }
}

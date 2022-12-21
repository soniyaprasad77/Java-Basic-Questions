/*Calculate commission percentage */
import java.util.Scanner;
public class Q06 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the amount : ");
        double amount = in.nextDouble();
        System.out.println("enter the commission percentage(%) : ");
        int  C_percent = in.nextInt();
        double commission = ( C_percent * amount ) /100;
        System.out.println("The commission on the given amount will be : " + commission);

    }
}

/* Calculate Depreciation of Value */
import java.util.Scanner;

public class Q08 {
    public static void main(String args[]){
        System.out.println("enter the Value : ");
        Scanner in = new Scanner(System.in);
        double value = in.nextDouble();
        System.out.println("enter the depreciation percentage : ");
        int D_percent = in.nextInt();
        double Depreciation_percentage = ( D_percent * value )/100;
        System.out.println("The value of depreciation is  " + Depreciation_percentage);

    }
}

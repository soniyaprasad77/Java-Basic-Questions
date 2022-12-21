/* Calculate Batting Average */
import java.util.Scanner;
public class Q09 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the total number of runs scored  ");
        double runs = in.nextDouble();
        System.out.println("enter the number of times out ");
        int num = in.nextInt();
        double batting_avg = runs /num ;
        System.out.println("The batting average of this player is : " +batting_avg);
    }
}

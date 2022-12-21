/* Calculate Batting average */
import java.util.*;
public class Q09 {
    public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            System.out.println("enter the total number of runs scored  ");
            double runs = in.nextDouble();
            System.out.println("enter the number of times out ");
            double num = in.nextInt();
            Batting_avg(runs, num);
    }
     static void Batting_avg(double runs, double num){
         double batting_avg = runs /num ;
         System.out.println("The batting average of this player is : " +batting_avg);
     }
}

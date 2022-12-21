/* Check Leap Year Or Not */
import java.util.*;
public class Q23 {
    public static void main(String[] args){
        System.out.println("enter the year: ");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        Check_leap_year(year);
    }
    static void Check_leap_year(int y){
        if(y%100==0){
            if(y%400==0){
                System.out.println(y + " is leap year.");
            }
            else{
                System.out.println(y + " is not leap year");
            }
        }
        else{
            if(y%4==0){
                System.out.println(y + " is leap year.");
            }
            else{
                System.out.println(y + " is not a leap year.");
            }
        }
    }
}

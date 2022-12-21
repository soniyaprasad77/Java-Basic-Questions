/* Kunal is allowed to go out with his friends only on the even days of a given month.
   Write a program to count the number of days he can go out in the month of August.
 */
import java.util.*;
public class Q25 {
    public static void main(String[] args){
        int num=31;
       Days_Allowed(num);
    }
    static void Days_Allowed(int num){
        int count=0;
        for(int i =1 ; i<=num; i++){
            if(i%2==0){
                count++;
            }
        }
        System.out.println("Kunal is allowed a total of " + count + " days to go out in the month of august.");
    }

}

/* To find Armstrong Number between two given number.
*/
import java.sql.SQLOutput;
import java.util.Scanner;
public class Q09 {
    public static void main(String[] args){
        System.out.println("enter a number : ");
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int numm=n1;
        int num=n1;
        /* Armstrong number eg: 153 : (1)^3 +(5)^3 +(3)^3 = 153 */
       int sum=0;
        int count=0;
        int power=1;
        while(num!=0){
           num= num/10;
           count++;
        }
        System.out.println(count);
      for(int j=1; j<=count; j++) {
          power=1;
          for (int i = 1; i <= count; i++) {
              power = (n1 % 10) * power;
          }
          sum=sum+power;
          n1=n1/10;
      }
      if(sum==numm){
          System.out.println(sum + " is a armstrong number.");
      }
      else{
          System.out.println(numm + " is not an armstrong number.");
      }


    }
}

/* Sum Of N Numbers */
import java.util.*;
public class Q13 {
    public static void main(String[] args){
        System.out.println("enter the number of numbers : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Sum_of_N(n);
    }
    static void Sum_of_N(int no){
        Scanner sc = new Scanner(System.in);
        int sum =0;
        for(int i=0; i<no; i++){
            System.out.println("enter the number now: ");
            int num = sc.nextInt();
            sum = sum + num;
        }
        System.out.println("The sum of the given numbers are: " + sum);
    }
}

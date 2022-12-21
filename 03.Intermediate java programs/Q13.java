/*Sum of N numbers */
import java.util.Scanner;
public class Q13 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of numbers you want to enter: ");
        int n = in.nextInt();
        int sum_ =0;
        for(int i = 0; i<n; i++){
            System.out.print("enter the numbers : ");
            int num = in.nextInt();
            sum_ = sum_ + num;
        }
        System.out.println("Sum of the above numbers is equal to " + sum_);


    }
}

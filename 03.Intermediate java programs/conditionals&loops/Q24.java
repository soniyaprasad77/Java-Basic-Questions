/*Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)*/
import java.util.Scanner;
public class Q24 {
    public static void main(String[] args){
        int sum = 0;
        while(true) {
            System.out.print(" enter the number : ");
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();

            if(num == 0){
                break;
            }
            sum = sum + num;
        }
        System.out.print(sum + " is the sum of given numbers. ");
    }
}

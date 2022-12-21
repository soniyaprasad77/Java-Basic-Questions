/*Average of N numbers.*/
import java.util.Scanner;
public class Q03 {
    public static void main(String args[]){
        System.out.println("enter the no. of numbers for which you want to calculate the average :");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        double avg =0;
        for(int i = 1; i<=N; i++){
            System.out.println("enter the number: ");
            double num = in.nextDouble();
            avg = avg + num;
        }
        double avgg = avg/N;
        System.out.println(avgg + " is the average of given numbers : ");
    }
}

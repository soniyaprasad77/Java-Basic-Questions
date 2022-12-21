/* Calculate Average Of N Numbers */
import java.util.*;

public class Q03 {
    public static void main(String[] args){
    System.out.println(Average());

    }
    static double Average(){
        System.out.println("enter the no. of numbers you want to enter: ");
        Scanner in = new Scanner(System.in);
         int N = in.nextInt();
        double avg = 0;
        for(int i =1; i<=N; i++){
            System.out.println("enter the numbers: ");
            int num = in.nextInt();
            avg = avg + num;
        }
        double t_avg = avg/N;
         return t_avg;
    }
}

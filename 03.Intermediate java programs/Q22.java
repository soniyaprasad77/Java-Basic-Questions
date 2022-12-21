/* Perfect Number In Java */
import java.util.*;
public class Q22 {
    public static void main(String[] args){
//        System.out.println("enter any number: ");
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        int sum = 0;
//        for(int i=1; i<num; i++){
//            if(num%i==0){
//                sum = sum + i;
//            }
//        }
//        if(sum==num){
//            System.out.println("It is a perfect number.");
//        }
//        else{
//            System.out.println("It is not a perfect number.");
//        }
        // print all the perfect numbers between 1 and 500.

        for(int i =1; i<=10000; i++){
            int sum =0;
            for(int j=1; j<i; j++){
                if(i%j==0){
                    sum = sum + j;
                }
            }
            if(sum==i) {
                System.out.print( sum + "  ");
            }
        }
  }
}

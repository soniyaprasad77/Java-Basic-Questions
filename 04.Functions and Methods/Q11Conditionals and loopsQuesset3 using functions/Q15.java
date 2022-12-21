/* Find Ncr & Npr */
import java.util.*;
public class Q15 {
    public static void main(String[] args){
        System.out.println("enter the Number : ");
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        System.out.println("enter the number which to be chosen: ");
        int r = in.nextInt();
        int ncr = fact(n)/(fact(r)*fact(n-r));
        int npr = fact(n)/(fact(n-r));
        System.out.println("nCr is : " + ncr);
        System.out.println("nPr is " + npr);
    }
    static int fact(int n){
       int fact=1;
       for(int i =1; i<=n; i++){
           fact=fact*i;
       }
       return fact;
    }
}

/* find nCr and nPr */
import java.util.Scanner;
public class Q15 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the set of objects (n) : ");
        long n = in.nextInt();
        System.out.println("enter the no. of selection of r objects");
        long r = in.nextInt();
        long num =n;
        long n_fact =1;
        for(int i=1; i<=num; i++){
            n_fact = n_fact * i;
        }
        long r_fact =1;
        for(int k = 1; k<=r; k++){
            r_fact = r_fact *k;
        }
        long nr_fact = 1;
        for(int j=1; j<=n-r; j++){
            nr_fact = nr_fact * j;
        }
        long nCr = n_fact/(r_fact * nr_fact);
        long nPr = n_fact/nr_fact ;
        System.out.println(" the nCr is : " + nCr);
        System.out.println(" the nPr is : " + nPr);
    }
}

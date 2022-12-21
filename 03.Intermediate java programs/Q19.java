/* find the hcf of two numbers */
import java.util.*;
public class Q19 {
    public static void main(String[] args){
        System.out.println("enter the first number : ");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        System.out.println("enter the second number : ");
        int num2 = in.nextInt();
        int hcf=0;

        for(int i=1; i<=num1/2 || i<=num2/2 ; i++ ){
            if(num1%i == 0 && num2%i ==0){
                hcf =i;
            }

        }
        System.out.println("the highest common factor is : " + hcf);

    }
}

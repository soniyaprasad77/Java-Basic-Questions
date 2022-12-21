/* HCF Of Two Numbers Program */
import java.util.*;
public class Q19 {
    public static void main(String[] args){
        System.out.println("enter the number 1: ");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        System.out.println("enter the number 2");
        int num2 = in.nextInt();
        HCF(num1,num2);
    }
    static void HCF(int n1,int n2){
        int max;
        int hf1=0;
        int hf2=0;
        if(n1>n2){
            max=n1;
        }
        else{
            max=n2;
        }
        for(int i=max/2,j=max/2;i>0 && j>0;j-- , i--){
            if(n1%i==0) {
                 hf1 = i;
            }
            if(n2%j==0) {
                 hf2 = j;

            }
         if(hf1==hf2 && hf1!=0){
             break;
         }
        }
        if(hf1==hf2){
            System.out.println(hf1);
        }
    }
}

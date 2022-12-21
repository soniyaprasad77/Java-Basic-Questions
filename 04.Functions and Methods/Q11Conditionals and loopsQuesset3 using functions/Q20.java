/*LCM Of Two Numbers*/
import java.util.*;
public class Q20 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int num1=in.nextInt();
        System.out.println("enter the second number: ");
        int num2=in.nextInt();
        findLCM(num1,num2);

    }
    static void findLCM(int n1, int n2){
        int lcm;
        if(n1>n2){
            lcm=n1;
        }
        else{
            lcm=n2;
        }
        while(true){
            if(lcm%n1==0 && lcm%n2==0){
                System.out.println("The lcm of given numbers are :" + lcm);
                break;
            }
            ++lcm;
        }
    }
}

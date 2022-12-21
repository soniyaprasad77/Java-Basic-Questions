/* LCM Of Two Numbers */
import java.util.Scanner;
public class Q20 {
    public static void main(String[] args){
        System.out.println("enter the first number : ");
        Scanner in = new Scanner(System.in);
        int f_num = in.nextInt();
        System.out.println("enter the second number : " );
        int S_num = in.nextInt();
        int lcm;
        if (f_num > S_num){
            lcm = f_num;
        }
        else{
            lcm = S_num;
        }
        while(true){
            if(lcm%f_num == 0 && lcm%S_num==0){
                System.out.println( "the lcm is : " + lcm);
                break;
            }
            lcm++;
        }
    }
}

/* Calculate CGPA Java Program */
import java.util.Scanner;
public class Q10 {
    public static void main(String ags[]){
        System.out.println("enter the number of subjects: ");
        Scanner in = new Scanner(System.in);
        double num = in.nextDouble();
        double credit=0;
        double T_credit=0;
        double g_credit =1;
        double c_p =0;
        for(int i = 1; i<=num; i++) {
            System.out.println("enter the marks obtained in each subject (under 100): ");
            double marks = in.nextDouble();
            System.out.println("enter the credits of each subject (under 5)");
            g_credit = in.nextDouble();
            if(marks >=90){
                credit =10;
            }
            else if(marks <=90 && marks >=80){
                credit = 9;
            }
            else if(marks <=80 && marks >=70){
                credit =8;
            }
            else if(marks <=70 && marks >=60){
                credit = 7;
            }
            else if(marks <=60 && marks >= 50){
                credit = 6;
            }
            else if(marks <=50 && marks >=40){
                credit = 5;
            }
            else{
                System.out.println("you are failed in this subject.");
            }
            System.out.println("The credit earned in above subject " + credit);
            T_credit = T_credit + credit*g_credit ;
            c_p = c_p + g_credit;

        }
        System.out.println("The total credits earned is " + T_credit);

        double cgpa = T_credit / c_p;
        System.out.println("the cgpa is " + cgpa);
    }
}

/* Calculate Average Marks */
import java.util.*;
public class Q12 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of subjects : ");
        Scanner sc = new Scanner(System.in);
        int sub = sc. nextInt();

        Cal_Avg(sub);
    }
    static void Cal_Avg(int sub){
        double marks_ = 0;
        Scanner in = new Scanner(System.in);
        for(int i = 0; i<sub ; i++){
            System.out.println("enter the marks of each sub : ");
            double marks = in.nextDouble();
            marks_ = marks_ + marks;

        }
        double avg_marks = marks_ /sub ;
        System.out.println("The average marks is : " + avg_marks);
    }
}

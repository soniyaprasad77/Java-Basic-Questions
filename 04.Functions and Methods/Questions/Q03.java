/* A person is eligible to vote if his/her age is greater than or equal to 18.
Define a method to find out if he/she is eligible to vote.
 */
import java.util.*;
public class Q03 {
    public static void main(String[] args){
        System.out.println("enter age:");
        Scanner in = new Scanner(System.in);
        int age =in.nextInt();
        eligibility(age);
    }
    static void eligibility(int age){
        if(age>0 && age<18)
            System.out.println("You are not eligible to vote.");
        else if(age>=18 && age<120)
            System.out.println("You are eligible to vote.");
        else{
            System.out.println("You are not a human.");
        }
    }

}

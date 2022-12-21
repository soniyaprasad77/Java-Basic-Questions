/* Take 2 numbers as input and print the largest number. */
import java.util.Scanner;
public class Q05 {
    public static void main(String[]args){
        System.out.println("enter a number : ");
        Scanner in = new Scanner(System.in);
        int num1= in.nextInt();
        System.out.println("enter another number : ");
        int num2 = in.nextInt();
        if(num1>num2){
            System.out.println(num1 + " is greater than " + num2);
        }
        else{
            System.out.println(num2 + " is greater than " + num1);
        }
    }
}

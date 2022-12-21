/* Write a program to show that a given number is even and odd . */
import java.util.Scanner;
public class Q01 {
    public static void main(String[] args){
        System.out.println("enter the number: ");
        Scanner in= new Scanner(System.in);
        int num = in.nextInt();
        if(num%2==0) {
            System.out.println("The given number is even. ");
        }
        else{
            System.out.println("The given number is odd. ");
            }

    }
}

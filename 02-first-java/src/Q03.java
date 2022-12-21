/* Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

 */
import java.util.Scanner;
public class Q03 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter principal(T) : ");
        int principal = sc.nextInt();
        System.out.println("enter time(T) : ");
        float time = sc.nextFloat();
        System.out.println("enter rate(R) : ");
        float rate = sc.nextFloat();
        Float SI = (principal*rate*time)/100;
        System.out.println("The Simple Interest is " + SI);

    }
        }

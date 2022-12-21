/* Take in two numbers and an operator (+, -, *, /) and calculate the value.
(Use if conditions) */
import java.util.Scanner;

public class Q04 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number : ");
        int n1 = sc.nextInt();
        System.out.println("enter any of the (+,-,*,/)  operators : ");
        char operator = sc.next().charAt(0);
        System.out.println("enter second number : ");
        double n2 = sc.nextInt();
        double sum =  n1 + n2;
        double mul = n1 * n2 ;
        double sub = n1-n2;
        double divide = n1/n2;
        if(operator =='+'){
            System.out.println(" sum is : " + sum);
        }
        else if(operator=='-'){
            System.out.println("difference is : " + sub);
        }
        else if(operator=='*'){
            System.out.println("multiplication is : " + mul);
        }
        else if(operator=='/'){
            System.out.println("division is : " + divide);

        }
        else{
            System.out.println("Please enter a valid input!");
        }

    }
}

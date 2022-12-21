/* Input a number and print all the factors of that number (use loops).
*/
import java.util.Scanner;
public class Q23 {
    public static void main(String[] args){
        System.out.println("enter a number of your choice : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i =1; i<=num; i++){
            if(num%i==0){
                System.out.print(i + "  ");
            }
        }
    }
}

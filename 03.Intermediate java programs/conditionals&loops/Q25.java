/* Take integer inputs till the user enters 0 and print the largest number from all. */
import java.util.Scanner;
public class Q25 {
    public static void main(String[] args) {
        int temp=0;
        while(true){
            System.out.println("enter the number : ");
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            if(num==0){
                break;
            }
            if(num>temp){
                temp=num;
            }

        }
        System.out.println(temp + " is the largest number . ");

    }

}

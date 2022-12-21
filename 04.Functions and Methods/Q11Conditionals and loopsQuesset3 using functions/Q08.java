/* Calculate Depreciation of Value
*/
import java.util.*;
public class Q08 {
    public static void main(String[] args){
        System.out.println("enter the amount: ");
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        System.out.println("enter the depreciation percentage: ");
        int dep = in.nextInt();
        Depreciation(amount, dep);
    }
    static void Depreciation(int n, int per){
         int depp = (n  * per)/100;
        System.out.println(depp);
    }
}

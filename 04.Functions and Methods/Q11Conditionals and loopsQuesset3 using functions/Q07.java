/* Power In Java */
public class Q07 {
    public static void main(String[] args){
        int num =2;
        int power =10;
        System.out.println(pow(num,power));
    }
    static int pow(int number, int powerr){
        int value = 1;
        for(int i=1; i<=powerr; i++){
            value = value * number;
        }
        return value;
    }
}

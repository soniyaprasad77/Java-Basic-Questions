public class scope {
    public static void main(String[] args) {
        //scope of a function is in that function only
        int num=10 ;
        int n=40;
        {
            int a = 10;
            num = 80; // but this is possible that we cannot access the data types out of the block
            // and can be modified inside the block
        }
        //  a = 29; out of block the declared variable cannot be accessed and modified
        int scopp = scope(num, n);
        System.out.println(scopp); // here sum cannot be accessed

    }
    static int scope(int a, int b){
        int sum = a + b; // here n and num cannot be accessed.

        return sum;
    }

}

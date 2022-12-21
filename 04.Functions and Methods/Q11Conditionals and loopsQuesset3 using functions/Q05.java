/* Calculate Distance Between Two Points */

public class Q05 {
    public static void main(String[] args){
   double x1 = 5;
   double x2 =10;
   double y1 = 20;
   double y2 = 40;
   System.out.println(Distance(x1, y1, x2, y2));

    }
    static double Distance(double x1, double y1, double x2, double y2){
        double distance=0;
        if(x1 > x2 && y1> y2)      {
            distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        }
        if(x1< x2 || y2<y1){
            distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        }
        return distance;
    }
}

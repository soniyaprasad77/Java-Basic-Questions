/* Calculate CGPA Java Program */

public class Q10 {
    public static void main(String[] args) {
        double[] credit ={4,5,4,2,1,1};
        double[] grade ={8,9,7,6,10,50};
        System.out.println(Cgpa(credit, grade));
    }
    static double Cgpa(double[]credits, double[] grades ) {
        double scgpa=0;
        for (int i = 0; i < credits.length; i++) {
            double s_gpa =grades[i] * credits[i];
             scgpa = scgpa +s_gpa ;
        }
        double sum =0;
        for(int i=0; i<credits.length;i++){
            sum = sum + credits[i];
        }
        System.out.println(sum);
        double cgpa = scgpa/sum;
        return cgpa;
    }
}

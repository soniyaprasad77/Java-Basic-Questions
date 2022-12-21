/* Write a program that will ask the user to enter his/her marks (out of 100).
Define a method that will display grades according to the marks entered as below:
Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail

 */
import java.util.*;
public class Q08 {
    public static void main(String[] args){
        System.out.print("enter the marks(under 100): ");
        Scanner in = new Scanner(System.in);
        int marks = in.nextInt();
        System.out.println(grade(marks));
    }
        static String grade(int mark) {
            String grade = null;
            // code to determine grade goes here
            if (mark >= 91 && mark <= 100) {
                grade = "AA";
            } else if (mark >= 81 && mark <= 90) {
                grade = "AB";
            } else if (mark >= 71 && mark <= 80) {
                grade = "BB";
            } else if (mark >= 70 && mark <= 61) {
                grade = "BC";
            } else if (mark <= 60 && mark >= 51) {
                grade = "CD";
            }
            else if(mark <=50 && mark >=40){
                grade = "DD";
            }
            else if(mark<=40){
                grade="FF";
            }
            else {
                grade = "Not found";
            }
            return grade;
        }


    }




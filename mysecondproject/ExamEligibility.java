
import java.util.Scanner;

public class ExamEligibility {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-------Welcome To Exam Eligible Checker  --------");
        double Attendance, AssignmentMark;

      
        System.out.print("Enter Your Exam Marks: ");
        if (input.hasNextDouble()) {
            Attendance = input.nextDouble();
        } else {
            System.out.println("Error: Invalid input. Please enter a valid Attendance Presentage.");
            return;
        }
        System.out.print("Enter Your Assignment Marks: ");
        if (input.hasNextDouble()) {
            AssignmentMark = input.nextDouble();
        } else {
            System.out.println("Error: Invalid input. Please enter a valid Assignment Marks.");
            return;
        }
        
        if( Attendance >75 && AssignmentMark >= 45 ){
            System.out.println("You are Eligible the Exam");
        }else{ 
            System.out.println("You are Not Eligible the Exam");
        }
    }
}


package mysecondproject;
import java.util.Scanner;
public class NumberOrNotChecker {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         double Number;
        System.out.println("-------Welcome To Number or Not Checker--------");
        System.out.print("Enter Your Number: ");    
        if (input.hasNextDouble()) {
            Number = input.nextDouble();
        } else {
            System.out.println("Error: This is not a number");
            return;
        }
        
        System.out.println("This is the Number :" + Number);
    }
}

      
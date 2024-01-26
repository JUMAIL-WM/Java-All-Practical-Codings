
import java.util.Scanner;
public class FourthOne {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Temp: ");
        double Temp = scanner.nextDouble();
        
        double faranhite = (Temp * 1.8) + 32;
        
        System.out.println(faranhite);
        scanner.close();
    }
}


}

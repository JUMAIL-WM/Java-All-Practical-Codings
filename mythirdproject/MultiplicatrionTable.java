
import java.util.Scanner;

public class MultiplicatrionTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        while (true) {
            System.out.print("Enter a positive integer: ");
            if (input.hasNextInt()) {
                number = input.nextInt();
                if (number > 0) {
                    break;
                }
            }
            input.nextLine();
            System.out.println("Invalid input. Please enter a positive integer.");
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
}

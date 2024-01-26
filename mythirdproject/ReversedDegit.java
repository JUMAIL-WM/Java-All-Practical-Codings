
import java.util.Scanner;
public class ReversedDegit {
    public static void main(String[] args) {
        Scanner Input = new Scanner (System.in);
        System.out.println("Enter an Integer : ");
        
        int num = Input.nextInt();
        String reves = "";
        
        for(; num> 0; num /= 10){
            int degit = num %10;
            
            reves += degit + " ";
        }
        System.out.println(reves);
    }
    
}

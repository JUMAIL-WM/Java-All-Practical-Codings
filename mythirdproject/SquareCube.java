
import java.util.Scanner;
public class SquareCube {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
         int n;
         System.out.println("Enter a Number");
         n = input.nextInt();
         System.out.print("Number\tSquare\tCube");
         for(int i = 1; i <= n ; i++){
             int square = i * i;
             int cube = i*i*i;
             
             System.out.println(i +"\t" + square + "\t" + cube);
           }
    }
}


public class ThirdClass {

    public static void main(String[] args) {
        int Num1 = 100, Num2= 200;

        System.out.println("Before Swap");
        System.out.println("Num1 = " + Num1);
        System.out.println("Num2 = " + Num2);

        int temp = Num1;
        Num1 = Num2;
        Num2 = temp;

        System.out.println("After swap");
        System.out.println("Num1 = " + Num1);
        System.out.println("Num2 = " + Num2);

    }
}
}

package TugasSesi4;
import java.util.Scanner;

public class MultiplicationTableSingleNumber {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        System.out.print("Input: N = ");
        int N = inputan.nextInt();

        System.out.println("Output: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }
        inputan.close();
    }
    
}

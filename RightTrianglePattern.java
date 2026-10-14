package TugasSesi4;
import java.util.Scanner;

public class RightTrianglePattern {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        System.out.print("Input: N = ");
        int N = inputan.nextInt();

        System.out.println("Output: ");
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

            inputan.close();
        }
    }
    
}

package TugasSesi4;
import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        System.out.print("Input: N = ");
        int N = inputan.nextInt();

        System.out.println("Output: ");
        for (int i = 0; i < N; i++) {
            int val = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(val + " ");
                val = val * (i - j) / (j + 1);
            }
            System.out.println();

            inputan.close();
        }
    }
    
}

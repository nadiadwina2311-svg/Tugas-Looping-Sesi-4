package TugasSesi4;
import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        System.out.print("Input: N = ");
        int N = inputan.nextInt();

        System.out.print("Output: ");
        for (int i = 0; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

            inputan.close();
        }
    }
    
}

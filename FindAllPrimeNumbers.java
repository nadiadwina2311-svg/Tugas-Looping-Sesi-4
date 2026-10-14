package TugasSesi4;
import java.util.Scanner;

public class FindAllPrimeNumbers {
    public static boolean isPrimeSqrt(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        System.out.print("Input: N = ");
        int N = inputan.nextInt();

        System.out.print("Output: ");
        for (int i = 2; i <= N; i++) {
            if (isPrimeSqrt(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        inputan.close();
    }
    
}

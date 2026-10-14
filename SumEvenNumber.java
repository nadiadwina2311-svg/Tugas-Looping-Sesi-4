package TugasSesi4;
import java.util.Scanner;

public class SumEvenNumber {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        System.out.print("Input: N = ");
        int N = inputan.nextInt();

        int sum = 0;
        for (int i = 0; i <= N; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.print("Output: Sum of even numbers = " + sum);
        inputan.close();
    }
    
}

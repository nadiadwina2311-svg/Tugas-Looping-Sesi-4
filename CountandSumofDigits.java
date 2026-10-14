package TugasSesi4;
import java.util.Scanner;

public class CountandSumofDigits {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        System.out.print("Input: N = ");
        long N = inputan.nextLong();

        long temp = N;
        int count = 0;
        long sum = 0;

        if (temp == 0) {
            count = 1;
            sum = 0;
        } else {
            while (temp > 0) {
                long digit = temp % 10;
                sum += digit;
                count++;
                temp /= 10;
            }
        }

        System.out.println("Output: ");
        System.out.println("Number of digits = " + count);
        System.out.println("Sum of digits = " + sum);

        inputan.close();

    }
    
}

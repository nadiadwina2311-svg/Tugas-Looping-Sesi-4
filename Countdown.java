package TugasSesi4;
import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        System.out.print("Input: N = ");
        int N = inputan.nextInt();

        System.out.print("Output: ");
        for (int i = N; i>= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Start!");

        inputan.close();
    }
    
}

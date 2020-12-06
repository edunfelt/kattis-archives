import java.util.Arrays;
import java.util.Scanner;

public class Bijele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] input = new int[6];
        int[] pieces = {1, 1, 2, 2, 2, 8};
        int[] output = new int[6];

        for(int i = 0; i < 6; i++) {
            input[i] = sc.nextInt();
            output[i] = pieces[i] - input[i];
        }

        sc.close();

        Arrays.stream(output).forEach(System.out::println);
    }
}

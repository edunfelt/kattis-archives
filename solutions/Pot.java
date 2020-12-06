import java.util.Scanner;

public class Pot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 0; i < n; i++) {
            String input = Integer.toString(sc.nextInt());
            int power = Integer.parseInt(String.valueOf(input.charAt(input.length()-1)));
            int base = Integer.parseInt(input.substring(0, input.length() - 1));
            sum += Math.pow(base, power);
        }

        sc.close();

        System.out.println(sum);
    }
}

import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int player = 0;

        for(int i = 0; i < 5; i++) {
            int cur = 0;
            for(int j = 0; j < 4; j++) {
                cur += sc.nextInt();
            }
            if(cur > max) {
                max = cur;
                player = i+1;
            }
        }

        sc.close();

        System.out.println(player + " " + max);
    }
}

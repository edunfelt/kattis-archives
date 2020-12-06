import java.util.Scanner;

public class ColdputerScience {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int negTemps = 0;

        for(int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if(temp < 0) {
                negTemps++;
            }
        }
        sc.close();

        System.out.println(negTemps);
    }
}

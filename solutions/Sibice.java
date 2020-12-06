import java.util.Scanner;

public class Sibice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        double dimension = Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2));
        double max = Math.max(Math.max(w, h), dimension);
        int[] lengths = new int[n];

        for(int i = 0; i < n; i++) {
            lengths[i] = sc.nextInt();
        }

        sc.close();

        for(int i : lengths) {
            if(i > max){
                System.out.println("NE");
            } else {
                System.out.println("DA");
            }
        }
    }
}

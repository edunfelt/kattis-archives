import java.util.Scanner;

public class Bela {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4 * sc.nextInt();
        String b = sc.nextLine();
        int sum = 0;

        for(int i = 0; i < n; i++) {
            String card = sc.nextLine();
            String c1 = "" + card.charAt(0);
            String c2 = "" + card.charAt(1);

            if(c1.equals("A")) {
                sum += 11;
            } else if(c1.equals("K")) {
                sum += 4;
            } else if(c1.equals("Q")) {
                sum += 3;
            } else if((c1 + b).equals("J " + c2)) {
                sum += 20;
            } else if(c1.equals("J")) {
                sum += 2;
            } else if(c1.equals("T")) {
                sum += 10;
            } else if((c1 + b).equals("9 " + c2)) {
                sum += 14;
            }
        }
        sc.close();

        System.out.println(sum);
    }
}

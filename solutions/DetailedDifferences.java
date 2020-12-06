import java.util.Scanner;

public class DetailedDifferences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < n; i++) {
            String line1 = sc.nextLine();
            String line2 = sc.nextLine();
            StringBuilder out = new StringBuilder();

            for(int j = 0; j < line1.length(); j++) {
                if(line1.charAt(j) == line2.charAt(j)) {
                    out.append(".");
                } else {
                    out.append("*");
                }
            }
            System.out.println(line1);
            System.out.println(line2);
            System.out.println(out + "\n");
        }
        sc.close();
    }
}

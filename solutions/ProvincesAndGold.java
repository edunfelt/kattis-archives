import java.util.Scanner;

public class ProvincesAndGold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        int s = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int power = 3 * g + 2 * s + c;
        String victory = "";
        String treasure = "Copper";

        if (power >= 8) {
            victory = "Province";
            treasure = "Gold";
        } else if (power >= 5) {
            victory = "Duchy";

            if (power >= 6) {
                treasure = "Gold";
            } else {
                treasure = "Silver";
            }
        } else if (power >= 2) {
            victory = "Estate";

            if (power >= 3) {
                treasure = "Silver";
            } else {
                treasure = "Copper";
            }
        }

        if(!victory.equals("")) {
            System.out.println(victory + " or " + treasure);
        } else {
            System.out.println(treasure);
        }
    }
}

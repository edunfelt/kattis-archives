import java.util.Scanner;

public class CryptographersConundrum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String plain = sc.nextLine();
        String per = "PER";
        int time = plain.length();
        sc.close();

        for(int i = 0; i < plain.length(); i++) {
            if((i % 3 == 0) && plain.charAt(i) == per.charAt(0)) {
                time--;
            } else if((i % 3 == 1) && plain.charAt(i) == per.charAt(1)) {
                time--;
            } else if((i % 3 == 2) && plain.charAt(i) == per.charAt(2)) {
                time--;
            }
        }
        System.out.println(time);
    }
}


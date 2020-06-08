import java.util.Scanner;

public class DRMMessages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        String half1 = message.substring(0, message.length()/2);
        String half2 = message.substring(message.length()/2);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder plaintext = new StringBuilder();
        int r1 = 0;
        int r2 = 0;
        sc.close();

        for(int i = 0; i < half1.length(); i++) {
            r1 += alphabet.indexOf(half1.charAt(i));
            r2 += alphabet.indexOf(half2.charAt(i));
        }

        for(int i = 0; i < half1.length(); i++) {
            plaintext.append(alphabet.charAt((alphabet.indexOf(half1.charAt(i)) + alphabet.indexOf(half2.charAt(i)) + r1 + r2) % 26));
        }
        System.out.println(plaintext);
    }
}

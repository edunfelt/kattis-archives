import java.util.Scanner;

public class AlphabetSpam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        double whitesp = 0;
        double lower = 0;
        double upper = 0;
        double symb = 0;
        sc.close();

        for(int i = 0; i < line.length(); i++) {
            if(String.valueOf(line.charAt(i)).equals("_")) {
                whitesp++;
            } else if(Character.isLowerCase(line.charAt(i))) {
                lower++;
            } else if(Character.isUpperCase(line.charAt(i))) {
                upper++;
            } else {
                symb++;
            }
        }

        System.out.println(whitesp/line.length());
        System.out.println(lower/line.length());
        System.out.println(upper/line.length());
        System.out.println(symb/line.length());
    }
}

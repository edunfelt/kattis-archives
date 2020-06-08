import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Datum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        Locale locale = Locale.ENGLISH;
        DayOfWeek day = LocalDate.of(2009, m, d).getDayOfWeek();

        System.out.println(day.getDisplayName(TextStyle.FULL, locale));
    }
}

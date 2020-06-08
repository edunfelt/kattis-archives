import java.util.ArrayList;
import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> mods = new ArrayList<>(10);

        for(int i = 0; i < 10; i++) {
            int cur = sc.nextInt() % 42;

            if(!mods.contains(cur)) {
                mods.add(cur);
            }
        }
        sc.close();

        System.out.println(mods.size());
    }
}

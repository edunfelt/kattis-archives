import java.util.ArrayList;
import java.util.Scanner;

public class Trik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String moves = sc.nextLine();
        ArrayList<Integer> pos = new ArrayList<>(3);
        pos.add(1);
        pos.add(0);
        pos.add(0);

        sc.close();

        for(int i = 0; i < moves.length(); i++) {
            if(Character.toUpperCase(moves.charAt(i)) == 'A') {
                int e1 = pos.get(0);
                int e2 = pos.get(1);
                pos.set(1, e1);
                pos.set(0, e2);
            } else if(Character.toUpperCase(moves.charAt(i)) == 'B') {
                int e1 = pos.get(1);
                int e2 = pos.get(2);
                pos.set(2, e1);
                pos.set(1, e2);
            } else if(Character.toUpperCase(moves.charAt(i)) == 'C') {
                int e1 = pos.get(0);
                int e2 = pos.get(2);
                pos.set(2, e1);
                pos.set(0, e2);
            }
        }
        System.out.println(pos.indexOf(1) + 1);
    }
}

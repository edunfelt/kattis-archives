import java.util.ArrayList;
import java.util.Scanner;

public class BookingARoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<Integer> occupied = new ArrayList<>(n);

        for(int i = 0; i < n; i++) {
            occupied.add(sc.nextInt());
        }

        sc.close();

        if(occupied.size() == r) {
            System.out.println("too late");
        } else {
            for(int i = 1; i <= r; i++) {
                if(!occupied.contains(i)) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
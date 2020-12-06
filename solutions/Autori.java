import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = sc.nextLine().split("-");
        String shNames = "";

        for(String name : names){
            shNames += name.charAt(0);
        }

        sc.close();

        System.out.println(shNames);
    }
}

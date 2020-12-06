import java.util.Scanner;

public class Apaxiaaans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        StringBuilder newName = new StringBuilder();
        newName.append(name.charAt(0));

        for(int i = 1; i < name.length(); i++) {
            if(name.charAt(i) != name.charAt(i - 1)) {
                String current = "" + name.charAt(i);
                newName.append(current);
            }
        }
        sc.close();

        System.out.println(newName);
    }
}

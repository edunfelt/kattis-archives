import jdk.jshell.execution.DirectExecutionControl;

import java.util.Scanner;

public class IsItHalloween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month = sc.next();
        int date = sc.nextInt();
        sc.close();

        if((month.equals("OCT") && date == 31) || (month.equals("DEC") && date == 25)) {
            System.out.println("yup");
        } else {
            System.out.println("nope");
        }
    }
}

import java.util.Scanner;

class HissingMicrophone {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String word = sc.nextLine();

                sc.close();

                if(word.contains("ss")) {
                        System.out.println("hiss");
                } else {
                        System.out.println("no hiss");
                }
        }
}

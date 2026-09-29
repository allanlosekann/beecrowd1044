import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Setup
        Scanner sc = new Scanner(System.in);

        // Input
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Logic and Output
        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }
}
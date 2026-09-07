import java.util.Scanner;

public class Fakultet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv inn et tall: ");
        int n = scanner.nextInt();

        int fakultet = 1;

        for (int i = 1; i <= n; i++) {
            fakultet = fakultet * i;
        }

        System.out.println(n + "! = " + fakultet);
    }
}
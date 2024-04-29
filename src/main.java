import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char res;
        do {
            System.out.println("Digite a temperatura em Celsius: ");
            double C = sc.nextInt();
            double F = 9 * C / 5 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.2f%n", F);
            System.out.println("Deseja repetir (s/n)?");
            res = sc.next().charAt(0);
        } while (res != 'n');

        sc.close();
    }
}

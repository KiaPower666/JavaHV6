import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уровень треугольника:");
        int level = scanner.nextInt();
        for (int i = 0; i <= level; i++) {
            for (int j = 1; j <= level - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
        }
    }

}

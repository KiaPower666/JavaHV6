import java.util.Scanner;

public class BelBank {

    public static int balance = 15000;
    public static int amountLimit = 5000;
    public static int amountOperations = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int CurrentOperation = 1;

        while (true) {

            System.out.println("Ваш баланс - " + balance);
            System.out.println("Введите сумму которую хотите снять");
            int RequiredAmount = scanner.nextInt();

            if (CurrentOperation == 0) {
                break;
            } else if (amountLimit < RequiredAmount) {
                System.out.println("Превышен лимит суммы");
                break;
            } else if (amountOperations < CurrentOperation) {
                System.out.println("Превышен лимит операций");
                break;
            } else {
                CurrentOperation += 1;
                balance -= RequiredAmount;
            }
        }
    }
}

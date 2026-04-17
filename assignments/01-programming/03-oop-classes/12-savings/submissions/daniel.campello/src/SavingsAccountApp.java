import java.util.Scanner;

public class SavingsAccountApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo inicial da conta: ");
        double balance = scanner.nextDouble();

        SavingsAccount account = new SavingsAccount(balance);

        while (true) {
            System.out.print("Digite a nova taxa de juros anual (%) ou -1 para sair: ");
            double rateInput = scanner.nextDouble();

            if (rateInput == -1) {
                System.out.println("Programa encerrado.");
                break;
            }

            if (rateInput < 0) {
                System.out.println("Erro: a taxa deve ser um valor positivo ou -1 para sair.");
                continue;
            }

            double rate = rateInput / 100.0;
            SavingsAccount.modifyInterestRate(rate);

            for (int month = 1; month <= 12; month++) {
                account.calculateMonthlyInterest();
                System.out.printf("Mês %d: R$%.2f%n", month, account.getSavingsBalance());
            }

            System.out.println();
        }

        scanner.close();
    }
}
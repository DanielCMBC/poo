import java.util.Scanner;

public class ParkingGarage {

    public static double calculateCharges(double hours) {
        if (hours <= 0 || hours > 24) {
            return -1;
        }

        double charge = 2.00;

        if (hours > 3.0) {
            charge += Math.ceil(hours - 3.0) * 0.50;
        }

        if (charge > 10.00) {
            charge = 10.00;
        }

        return charge;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int customerCount = 0;
        double totalReceipts = 0.0;

        while (true) {
            System.out.print("Digite o número de horas estacionadas para o cliente (ou -1 para sair): ");
            double hours = scanner.nextDouble();

            if (hours == -1) {
                break;
            }

            double charge = calculateCharges(hours);

            if (charge == -1) {
                System.out.println("Erro: o número de horas deve estar entre 0 e 24.");
            } else {
                customerCount++;
                totalReceipts += charge;
                System.out.printf("Cliente %d: Taxa de estacionamento: R$%.2f%n", customerCount, charge);
            }
        }

        System.out.printf("Total arrecadado ontem: R$%.2f%n", totalReceipts);

        scanner.close();
    }
}
import java.util.Scanner;

public class CollatzSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: "); 
        
        int n = scanner.nextInt(); 

        if (n < 1) { 
            System.out.println("Erro: O número deve ser um inteiro positivo.");
            return;
        } else {
            int totalSum = calculateTotalSum(n); 
            System.out.println("\nSoma dos termos: " + totalSum);
        }
        scanner.close(); 
    }

    public static int nextCollatz(int n) { 
        if (n % 2 == 0) {
            return n / 2;
        } else {
            return (n * 3) + 1;
        }
    }

    public static int calculateTotalSum(int n) {
        int sum = 0;
        System.out.print("Sequencia de Collatz: ");
        while (n != 1) {
            System.out.print(n + " → ");
            sum += n;
            n = nextCollatz(n);
        }
        System.out.print(1);
        sum += 1;

        return sum;
    }
}

// O nome da classe foi alterado para MedianCalculator. Você deve renomear o arquivo para MedianCalculator.java
public class medianCalculator {
    public static int findMedian(int a, int b, int c) {
        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            return a;
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        System.out.print("Digite o primeiro número: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        num3 = scanner.nextInt();
        int median = findMedian(num1, num2, num3);
        System.out.println("A mediana dos números é: " + median);
    }
}
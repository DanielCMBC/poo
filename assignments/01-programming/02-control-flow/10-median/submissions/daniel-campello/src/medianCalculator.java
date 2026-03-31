public class medianCalculator {
    public static double findMedian(int[] numbers) {
        java.util.Arrays.sort(numbers);
        int n = numbers.length;
        if (n % 2 == 1) {
            return numbers[n / 2];
        } else {
            return (numbers[n / 2 - 1] + numbers[n / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        System.out.println("Digite o primeiro número: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();
        System.out.println("Digite o terceiro número: ");
        num3 = scanner.nextInt();
        int[] numbers = {num1, num2, num3};
        double median = findMedian(numbers);
        System.out.println("A mediana é: " + median);
    }
}
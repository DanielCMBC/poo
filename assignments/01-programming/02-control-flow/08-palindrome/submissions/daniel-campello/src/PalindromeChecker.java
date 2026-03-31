import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isValidInput(String input) {
        if (input == null || input.length() == 0) {
            System.out.println("A entrada é nula ou vazia.");
            return false;
        }
        return true;
    }

    public static boolean isPalindrome(String input) {
        if (!isValidInput(input)) {
            return false;
        }
        
        String lowerInput = input.toLowerCase();
        int left = 0;
        int right = lowerInput.length() - 1;
        
        while (left < right) {
            char leftChar = lowerInput.charAt(left);
            char rightChar = lowerInput.charAt(right);
            
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else {
                if (leftChar != rightChar) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String word;
        System.out.println("Digite uma sequência: ");
        Scanner scanner = new Scanner(System.in);
        word = scanner.nextLine();
        
        if (word == null || word.length() == 0) {
            System.out.println("A sequência está vazia.");
        } else if (isPalindrome(word)) {
            System.out.println("A sequência é um palíndromo.");
        } else {
            System.out.println("A sequência não é um palíndromo.");
        }
        
        scanner.close();
    }
}
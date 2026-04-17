import java.util.Scanner;

public class IDPBank{
    private String firstName;
    private String lastName;
    private String CPF;
    private int ID;
    private static int Accounts = 1;
        
    public IDPBank(String firstName, String lastName, String CPF) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.CPF = CPF;
        this.ID = Accounts++;
    }

    public String createCustomer() {
        return 0;
    }
    public String openAccount(){
        return 0;
    }


    public static void main(String[]args) {
        int option;
        Scanner scanner = new Scanner(System.in);
        do{

        System.out.println("Seja bem-vindo ao IDP Bank! Escolha uma das opções abaixo:");
        System.out.println("1. Abrir conta");
        System.out.println("2. Consultar cliente");
        System.out.println("3. Depositar");
        System.out.println("4. Sacar");
        System.out.println("5. Sair");
        option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Primeiro: ");
                String firstName = scanner.nextLine();
                System.out.println("Sobrenome: ");
                String lastName = scanner.nextLine();
                System.out.println("CPF: ");
                String CPF = scanner.nextLine();
                CreateCustomer newCustomer = new CreateCustomer("First", "Last", "000.000.00-00", 0);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        
        }
        }while(option != 5);
    }
}
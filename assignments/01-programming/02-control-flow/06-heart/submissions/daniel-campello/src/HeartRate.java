import java.util.Scanner;

public class HeartRate {
    private String firstName;
    private String lastName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;

    public HeartRate(String firstName, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int calculateAge(int currentYear) {
        return currentYear - yearOfBirth;
    }

    public int calculateMaxHeartRate(int currentYear) {
        return 220 - calculateAge(currentYear);
    }

    public void printTargetHeartRate(int currentYear) {
        int maxHeartRate = calculateMaxHeartRate(currentYear);
        double minTarget = maxHeartRate * 0.50;
        double maxTarget = maxHeartRate * 0.85;
        System.out.printf("Frequência cardíaca alvo: %.0f - %.0f bpm%n", minTarget, maxTarget);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o seu primeiro nome: ");
        String firstName = input.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String lastName = input.nextLine();

        System.out.print("Digite sua data de nascimento (dia, mês e ano separados por espaço): ");
        int day = input.nextInt();
        int month = input.nextInt();
        int year = input.nextInt();

        HeartRate person = new HeartRate(firstName, lastName, day, month, year);

        System.out.println("Nome: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Data de Nascimento: " + person.getDayOfBirth() + "/" + person.getMonthOfBirth() + "/" + person.getYearOfBirth());
        System.out.println("Idade: " + person.calculateAge(2026) + " anos");
        System.out.println("Frequencia cardíaca máxima: " + person.calculateMaxHeartRate(2026) + " bpm");
        person.printTargetHeartRate(2026);
        input.close();
    }
}
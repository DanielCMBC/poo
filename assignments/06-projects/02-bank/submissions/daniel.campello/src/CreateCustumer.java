public class CreateCustomer extends IDPBank {
    public CreateCustomer(String firstName, String lastName, String cpf) {
        super(firstName, lastName, cpf);
    }
    @Override
    public String createCustomer(String firstName, String lastName, String cpf, int ID) {
        return 0;
    }
    double newCustomer = customer.createCustomer("First", "Last", "123.456.789-00", 0);
}
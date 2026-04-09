public abstract class IDPBank { // Removed 'abstract' for direct instantiation in main; reconsider if abstract is truly intended.
    private String firstName;
    private String lastName;
    private String CPF;
    private int ID;
    private static int clientCount; 
    private static int nextCount = 1;
    
    public IDPBank(String firstName, String lastName, String CPF) { // This is now a proper constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.CPF = CPF;
        this.ID = nextCount++;
        clientCount++;
    }

    public static int getClientCount() {
        return this.clientCount;
    }

    public int getID() {
        return this.ID;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCPF() {
        return this.CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public abstract void CreateCustomer(); 
}
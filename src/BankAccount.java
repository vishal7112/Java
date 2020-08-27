public class BankAccount {
    private String name;
    private int creditLimit;
    private String email;

    public BankAccount (){

        System.out.println("Empty constructor");
    }
    public BankAccount (String name, int creditLimit, String email){
        System.out.println("New constructor");
        this.creditLimit = creditLimit;
        this.email = email;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }


}

package ficha07.exer7;

public class BankAccount {
    private int accountNumber; // numero de conta
    private static int idAccount = 100; // id de cada instancia
    private float balance; // saldo
    private String ownerName; // nome do proprietario

    public BankAccount() {
        this.accountNumber = idAccount;
        idAccount++;
    }

    public BankAccount(String ownerName, float initialBalance) {
        this.balance = (initialBalance < 0) ? 0 : initialBalance;
        this.ownerName = ownerName;
        accountNumber = idAccount;
        idAccount++;
    }

    public void addBalance(float balance) {
        if (balance >= 0) {
            this.balance += balance;
            System.out.println("Good");
        }
        else 
            System.out.println("Saldo invalido");
    }

    public int getAccountNumber() { return this.accountNumber; }

    public float getBalance() { return this.balance; }

    public void updateOwnerName(String ownerName) { this.ownerName = ownerName; }
    public String getOwnerName() { return this.ownerName; }

    public float substrat(float balance) {
        if (balance <= this.balance) {
            this.balance -= balance; // a cada saque
            return balance;
        } 
        
        System.out.println("Saldo insuficiente");
        return -1;
    }
}

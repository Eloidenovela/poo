package ficha07.exer7;

/**
 * AccountManager
 */
public class AccountManager {

    private BankAccount[] listAccounts;
    private int numberAccounts;

    public AccountManager(int capacity) {
        this.numberAccounts = 0;
        listAccounts = new BankAccount[capacity];
    }

    // criar conta
    public void createAccount(String ownerName, float initialBalance) {
        try {
            this.listAccounts[numberAccounts] = new BankAccount(ownerName, initialBalance);
            numberAccounts++;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    // apagar conta
    public boolean deleteAccount(int bankAccount) {
        try {
            int index;
            if ((index = getIndexByBankAccount(bankAccount)) != (-1)) {
                
                for (int i = index ; i < numberAccounts - 1 ; i++) {
                    this.listAccounts[i] = this.listAccounts[i + 1];
                }
                
                numberAccounts--;
                return true;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return false;
    }

    // adicionar saldo ou depositar saldo
    public void addBalance(int bankAccount, float newBalance) {
        int index = (-1);
        if ((index = getIndexByBankAccount(bankAccount)) != (-1)) {
            listAccounts[index].addBalance(newBalance);
            // System.out.println("Good");
        }
    }

    // buscar o index da array atraves do numero da conta
    private int getIndexByBankAccount(int bankAccount) {
        try {
            for (int i = 0 ; i < numberAccounts ; i++) {
                if (bankAccount == listAccounts[i].getAccountNumber()) {
                    return i;
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return (-1);
    }

    // levantar certa quantia
    public float substratBalance(int bankAccount, float amount) {
        int index;

        if ((index = getIndexByBankAccount(bankAccount)) != (-1)) {
            listAccounts[index].substrat(amount);
            return amount;
        }

        System.out.println("Conta nao encontrada");
        return (-1);
    }

    public void showAccountInfo(int bankAccount) {

        int index;
        if ((index = getIndexByBankAccount(bankAccount)) != (-1)) {
            System.out.printf("%d\t%s\t%.2f\n", listAccounts[index].getAccountNumber(), listAccounts[index].getOwnerName(), listAccounts[index].getBalance());
        }
    }

    public void showAllAccounts() {
        try {
            System.out.println("Number\tOwnerName\tBalance");
            for (int i = 0 ; i < numberAccounts ; i++) {
                showAccountInfo(listAccounts[i].getAccountNumber());
            }
        } catch (Exception e) {
            System.err.println(e.getCause());
        }
    }
}
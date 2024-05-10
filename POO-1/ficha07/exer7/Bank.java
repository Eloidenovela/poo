package ficha07.exer7;

public class Bank {
    public static void main(String[] args) {
        AccountManager bank = new AccountManager(100);
        bank.createAccount("Eloide Novela", 100000);
        bank.createAccount("Elias Sibanda", 200000);
        bank.createAccount("Emmanuel Sibanda", 100000);
        bank.createAccount("Deuterio Novela", 300000);
        bank.createAccount("Eleuterio Novela", 400000);
        bank.showAllAccounts();

        bank.addBalance(100, 500);
        bank.showAccountInfo(100);

        bank.addBalance(100, 500);
        bank.showAccountInfo(100);

        bank.substratBalance(100, 11398.9f);
        bank.addBalance(100, 500);
        bank.showAccountInfo(100);
        bank.deleteAccount(104);
        bank.showAllAccounts();
    }
}

package exceptions.account;

import javax.security.auth.login.AccountNotFoundException;
import java.util.HashMap;

public class Bank {
    private HashMap<String, Account> accounts;

    public HashMap<String, Account> getAccounts() {
        return accounts;
    }

    public Bank() {
        accounts = new HashMap<>();
    }

    public void addAccount(String owner, double balance, double overdraftFrame) throws BankException{


        if (accounts.containsKey(owner)) {
            throw new BankException();
        }
        accounts.put(owner, new Account(owner, balance, overdraftFrame));
    }

    public void transfer(String fromOwner, String toOwner,double amount) throws AccountNotFoundException, BankException {
        double balancefromowner = accounts.get(fromOwner).getBalance();
        double balancetoowner = accounts.get(toOwner).getBalance();
        accounts.put(fromOwner, new Account(fromOwner, balancefromowner - amount, accounts.get(fromOwner).getOverdraftFrame()));
        accounts.put(toOwner, new Account(toOwner, balancetoowner + amount, accounts.get(toOwner).getOverdraftFrame()));

    }

    @Override
    public String toString() {
        return "Bank{" +
                "accounts=" + accounts +
                '}';
    }
}

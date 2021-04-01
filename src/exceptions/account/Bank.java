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

    public void transfer(String fromOwner, String toOwner,double amount) throws BankException, AccountnotfoundException {
        /*double balancefromowner = accounts.get(fromOwner).getBalance();
        double balancetoowner = accounts.get(toOwner).getBalance();*/
        Account fromowner = accounts.get(fromOwner);
        Account toowner = accounts.get(toOwner);

        if (!accounts.containsKey(fromOwner) || !accounts.containsKey(toOwner)) {
            throw new AccountnotfoundException();
        }

        try {
            fromowner.debit(amount);
            toowner.credit(amount);
        } catch (NotEnoughMoneyException e) {
            throw new BankException("the transaction was not successful",e);
        }

        /*try {
            accounts.put(fromOwner, new Account(fromOwner, balancefromowner - amount, accounts.get(fromOwner).getOverdraftFrame()));
            accounts.put(toOwner, new Account(toOwner, balancetoowner + amount, accounts.get(toOwner).getOverdraftFrame()));
        } catch (BankException e) {
            e.printStackTrace();
        }*/

    }

    @Override
    public String toString() {
        return "Bank{" +
                "accounts=" + accounts +
                '}';
    }
}

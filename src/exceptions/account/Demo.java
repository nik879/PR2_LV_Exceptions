package exceptions.account;

import javax.security.auth.login.AccountNotFoundException;
import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {

        double amount = 5000;
        String fromowner = "Niki Kachelmaier";
        String toowner = "Hannes Temmel";

        Bank Sparkasse = new Bank();
        try {
            Sparkasse.addAccount("Niki Kachelmaier",18_000,2000);
            Sparkasse.addAccount("Hannes Temmel",250_000,60_000);
//            Sparkasse.addAccount(niki.getOwner(), niki);
            System.out.println(Sparkasse.getAccounts());
        } catch (BankException e) {
            e.printStackTrace();
        }
        /*Sparkasse.getAccounts().get("Niki Kachelmaier").credit(500);
        System.out.println(Sparkasse.getAccounts());
        try {
            Sparkasse.getAccounts().get("Niki Kachelmaier").debit(18500);
        } catch (NotEnoughMoneyException e) {
            e.printStackTrace();
        }
        System.out.println(Sparkasse.getAccounts().get("Niki Kachelmaier"));*/

        try {
            Sparkasse.transfer(fromowner, toowner, amount);
            System.out.println("Transfering " + amount + " from " + fromowner + " to " + toowner);
        } catch (AccountnotfoundException e) {
            e.printStackTrace();
        } catch (BankException e) {
            e.printStackTrace();
        }
        System.out.println(Sparkasse.getAccounts());


    }
}

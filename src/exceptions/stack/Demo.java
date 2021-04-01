package exceptions.stack;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {

        Note Einkaufsliste = new Note(LocalDate.now(), "Einkaufsliste", "Banane,Apfel...");
        Note Plan = new Note(LocalDate.now(), "Plan", "Laufen, programmieren...");
        Note test = new Note(LocalDate.now(), "test", "software testen,fehlersuche...");
        Note email = new Note(LocalDate.now(), "Email", "mail an ma aussenden...");



        Stack stack = new Stack(3);

        try {
            stack.push(Plan);
            stack.push(Einkaufsliste);
            stack.push(test);
            stack.push(email);
            System.out.println(stack);


            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            System.out.println(stack);
        } catch (StackEmptyException e) {
            e.printStackTrace();
        }catch (StackfullException e) {
            e.printStackTrace();
        }
        System.out.println(stack);

    }
}

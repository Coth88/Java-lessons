import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;

public class EmailList {
    public  TreeSet<String> listMail = new TreeSet<String>();

    public void add(String email) {
        boolean math = email.matches("([A-Za-z0-9]{1,}[\\.-]{0,1}[A-Za-z0-9]{1,}+@[A-Za-z0-9]{1,}+[\\.]{1}[a-z]{2,4})");
        if (math) {
            if (listMail.contains(email.toLowerCase())) {
                System.out.println("Этот email уже добавлен");
            } else {
                listMail.add(email.toLowerCase());
                System.out.println("Добавлен email " + email.toLowerCase());
            }
        } else {
            System.out.println("Неверный формат email");
        }

    }

    public List<String> getSortedEmails() {
        ArrayList<String>sortedEmails = new ArrayList<String>();
        sortedEmails.addAll(listMail);
        // TODO: возвращается список электронных адресов в алфавитном порядке

        return sortedEmails;
    }

}

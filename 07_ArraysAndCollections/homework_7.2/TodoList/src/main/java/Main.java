import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {


        while (true) {
            Scanner scanner = new Scanner(System.in);
            String consol = scanner.nextLine();
            if (consol.equals("END")) {
                break;
            }

            Pattern pattern = Pattern.compile("([A-Z]+)\\s?(\\d*)\\s?(.*)");
            Matcher matcher = pattern.matcher(consol);

            while (matcher.find()) {
                if (matcher.group(1).equals("ADD")) {
                    if (!matcher.group(2).equals("") && Character
                        .isDigit(Integer.parseInt(matcher.group(2)))) {
                        todoList.add(Integer.parseInt(matcher.group(2)), matcher.group(3));
                    } else {
                        todoList.add(matcher.group(3));
                    }
                } else if (matcher.group(1).equals("EDIT")) {
                    todoList.edit(matcher.group(3), Integer.parseInt(matcher.group(2)));
                } else if (matcher.group(1).equals("DELETE")) {
                    todoList.delete(Integer.parseInt(matcher.group(2)));
                } else if (matcher.group(1).equals("LIST")) {
                    todoList.getTodos();
                }
            }
        }
    }
}

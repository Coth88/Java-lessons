import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }
      if (input.matches("^[А-ЯЁ][а-яё]+-?([А-ЯЁ][а-яё]+)? [А-ЯЁ][а-яё]+ [А-ЯЁ][а-яё]+")) {
        System.out.println("Фамилия: " + input.substring(0, input.indexOf(" ")));
        System.out
            .println("Имя: " + input.substring(input.indexOf(" ") + 1, input.lastIndexOf(" ")));
        System.out.println("Отчество: " + input.substring(input.lastIndexOf(" ") + 1));

      } else {
        System.out.println("Введенная строка не является ФИО");
      }
    }
  }
}
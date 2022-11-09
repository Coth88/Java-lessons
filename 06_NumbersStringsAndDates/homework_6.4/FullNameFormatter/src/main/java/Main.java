import java.util.Scanner;


public class Main {

  public static boolean isCyrillic = true;

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      int spaceCount = 0;
      isCyrillic = true;

      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }

      String text = input.trim();
      for (int i = 0; i < text.length(); i++) {
        int x = text.charAt(i);
        if (x == 32) {
          spaceCount++;
        }
        if (((x != 32 && x != 45) && x < 1040) || ((x > 1103) && (x != 2010))) {
          System.out.println("Введенная строка не является ФИО");
          isCyrillic = false;
          break;
        }
      }
      if (spaceCount != 2 && isCyrillic) {
        System.out.println("Введенная строка не является ФИО");
      } else if (isCyrillic) {
        System.out.println("Фамилия: " + text.substring(0, text.indexOf(" ")));
        System.out.println("Имя: " + text.substring(text.indexOf(" ") + 1, text.lastIndexOf(" ")));
        System.out.println("Отчество: " + text.substring(text.lastIndexOf(" ") + 1));
      }
    }
  }
}

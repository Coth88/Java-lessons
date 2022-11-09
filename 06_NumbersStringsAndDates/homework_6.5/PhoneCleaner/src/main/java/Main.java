import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }

      String number = input.replaceAll("[^0-9]", "");
      if (number.matches("[7]\\d{10}")) {
        //String countryCode = "7";
        System.out.println(number);
      } else if (number.matches("[8]\\d{10}")) {
        System.out.println(number.replaceFirst("8", "7"));
      } else if (number.matches("\\d{10}")) {
        String countryCode = "7";
        System.out.println(countryCode + number);
      } else {
        System.out.println("Неверный формат номера");
      }
      //TODO:напишите ваш код тут, результат вывести в консоль.
    }
  }

}

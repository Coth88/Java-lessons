import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PhoneBook phone = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите номер, имя или команду:");
            String input = scanner.nextLine();

            if (input.matches("[А-Яа-я]+") && !phone.phoneBook.containsValue(input)) {
                System.out.println("Такого имени в телефонной книге нет.");
                System.out.println("Введите номер телефона для абонента " + input + " :");
                while (true) {
                    String inputNumber = scanner.nextLine();
                    if (inputNumber.matches("^[78]{1}[0-9]{10}")) {
                        phone.addContact(inputNumber, input);
                        System.out.println("Контакт сохранен!");
                        break;
                    } else {
                        System.out.println("Неверваный формат ввода");
                        continue;
                    }
                }
                continue;
            }

            if (input.matches("^[78]{1}[0-9]{10}") && !phone.phoneBook.containsKey(input)) {
                System.out.println("Такого номера в телефонной книге нет.");
                System.out.println("Введите имя абонента для номера " + input + " :");
                while (true) {
                    String inputName = scanner.nextLine();
                    if (inputName.matches("[А-Яа-я]+")) {
                        phone.addContact(input, inputName);
                        System.out.println("Контакт сохранен!");
                        break;
                    } else {
                        System.out.println("Неверный формат ввода");
                        continue;
                    }
                }
                continue;
            }


            if (input.equals("LIST")) {
                System.out.println(phone.getAllContacts());
            }

            else  {
                System.out.println("Неверный формат ввода");
                continue;
            }
        }
    }
}


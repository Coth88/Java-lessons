import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class PhoneBook {

  public TreeMap<String, String> phoneBook = new TreeMap<>();

  public void addContact(String phone, String name) {
    boolean isPhone = phone.matches("^[78]{1}[0-9]{10}");
    boolean isName = name.matches("[А-Яа-я]+");
    if (isPhone && isName) {
      if (phoneBook.containsKey(phone)) {
        phoneBook.replace(phone, name);
      } else {
        phoneBook.put(phone, name);
        System.out.println();
      }
    }
    // проверьте корректность формата имени и телефона
    // если такой номер уже есть в списке, то перезаписать имя абонента
  }

  public String getNameByPhone(String phone) {
    // формат одного контакта "Имя - Телефон"
    // если контакт не найдены - вернуть пустую строку
    if (phoneBook.containsKey(phone)) {
      return phoneBook.get(phone) + " - " + phone;
    } else {
      return "";
    }
  }

  public Set<String> getPhonesByName(String name) {
    // формат одного контакта "Имя - Телефон"
    // если контакт не найден - вернуть пустой TreeSet
    TreeSet<String> phonesByNames = new TreeSet<>();
    for (String key : phoneBook.keySet()) {
      if (phoneBook.containsValue(name)) {
        phonesByNames.add(name + " - " + key);
        return phonesByNames;
      }
    }
    return new TreeSet<>();
  }

  public Set<String> getAllContacts() {
    // формат одного контакта "Имя - Телефон"
    // если контактов нет в телефонной книге - вернуть пустой TreeSet
    TreeSet<String> allContacts = new TreeSet<>();
    if (phoneBook.isEmpty()) {
      return new TreeSet<>();
    } else {
      for (String key : phoneBook.keySet()) {
        allContacts.add(phoneBook.get(key) + " - " + key);
      }
      return allContacts;
    }
  }
}

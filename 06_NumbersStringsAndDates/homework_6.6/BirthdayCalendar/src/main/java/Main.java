import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.text.DateFormatter;

public class Main {

  public static void main(String[] args) {

    int day = 16;
    int month = 5;
    int year = 2017;

    collectBirthdays(year, month, day);
  }

  public static String collectBirthdays(int year, int month, int day) {
    DateTimeFormatter printFormat = DateTimeFormatter
        .ofPattern(" - dd.MM.yyyy - E", new Locale("US"));
    LocalDate birthday = LocalDate.of(year, month, day);
    LocalDate today = LocalDate.now();
    today = today.plusDays(1);
    int count = 0;
    String text = "";

    while (birthday.isBefore(today)) {
      text = count + printFormat.format(birthday) + System.lineSeparator();
      System.out.println(text);
      birthday = birthday.plusYears(1);
      count++;
    }

    return text;

  }
}

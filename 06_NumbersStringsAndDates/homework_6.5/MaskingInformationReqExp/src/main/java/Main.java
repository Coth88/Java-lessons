import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    String text = "Номер кредитной карты <4008> 1234 <5678> 8912";
    System.out.println(searchAndReplaceDiamonds(text, "***"));
  }

  public static String searchAndReplaceDiamonds(String text, String placeholder) {
    String text1 = text.replaceAll("<[0-9\\s]+>", placeholder);
 return text1;
  }


}
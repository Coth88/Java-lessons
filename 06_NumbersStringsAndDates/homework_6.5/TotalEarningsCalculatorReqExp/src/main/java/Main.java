public class Main {

  public static void main(String[] args) {
String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    System.out.println(calculateSalarySum(text));
  }

  public static int calculateSalarySum(String text) {
    if (text.equals("Никто ничего не заработал")) {
      return 0;
    } else {

      int sumMany = 0;
      String text1 = text.replaceAll("[^0-9,]", "");
      String[] sum = text1.split(",");
      for (int i = 0; i < sum.length; i++) {
        sumMany += Integer.parseInt(sum[i]);
      }
      //TODO: реализуйте метод
      return sumMany;
    }
  }
}
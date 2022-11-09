public class Main {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    //TODO: напишите ваш код, результат вывести в консоль
    String vasyaRub = "рублей";
    int vasyaEndIndex = text.indexOf(vasyaRub);
    String a = text.substring(15,vasyaEndIndex).trim();
    int vasyaMany = Integer.parseInt(a);

    String petyaRub = "рубля";
    int petyaEndIndex = text.indexOf(petyaRub);
    int petyaStartIndex = text.indexOf('-');
    String b = text.substring(petyaStartIndex + 1, petyaEndIndex).trim();
    int petyaMany = Integer.parseInt(b);

    String mashaRub = "рублей";
    int mashaEndIndex = text.lastIndexOf(mashaRub);
    int mashaStartIndex = text.lastIndexOf('-');
    String c = text.substring(mashaStartIndex + 1, mashaEndIndex).trim();
    int mashaMany = Integer.parseInt(c);

    System.out.println(vasyaMany + petyaMany + mashaMany);





  }

}
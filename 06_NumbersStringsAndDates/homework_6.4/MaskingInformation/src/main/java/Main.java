public class Main {

    public static void main(String[] args) {
        String text = "Номер кредитной карты <4008> 1234 <5678> 8912";
        System.out.println(text);
        System.out.println(searchAndReplaceDiamonds(text, "***"));

    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {
        // TODO: реализовать метод, если в строке нет <> - вернуть строку без изменений
        if (text.length() == 0) return text;

        int index1 = text.indexOf('<');
        int index2 = text.indexOf('>');
        int index3 = text.lastIndexOf('<');
        int index4 = text.lastIndexOf('>');

        if (index2 < 0) return text;

        if (index1 == index3 && index2 == index4) {
            String text1 = text.substring(0, index1);
            String text2 = text.substring(index2 + 1);
            return text1 + placeholder + text2;
        } else {
            String text1 = text.substring(0, index1);
            String text2 = text.substring(index2 + 1, index3);
            String text3 = text.substring(index4 + 1);
            return  text1 + placeholder + text2 + placeholder + text3;
        }
    }
}
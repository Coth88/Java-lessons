import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {

    //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
    public static String[] reverse (String[] strings){
        String reverse = "";

        for (int i = 0; i < strings.length / 2; i++) {
            reverse = strings[i];
            strings[i] = strings[strings.length - i -1];
            strings[strings.length - i -1] = reverse;
             }
        return strings;
    }
}

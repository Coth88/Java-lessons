import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;


public class CoolNumbers {

  private static List<String> autoNumber = new ArrayList<>();


  public static List<String> generateCoolNumbers() {
    String[] letters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
    for (int i = 0; i < letters.length; i++) {
      for (int numberInt = 111; numberInt <= 999; numberInt += 111) {
        for (int j = 0; j < letters.length; j++) {
          for (int k = 0; k < letters.length; k++) {
            for (int regionNumber = 1; regionNumber <= 199; regionNumber++) {
              String number = String.valueOf(numberInt);
              String region = String.valueOf(regionNumber);
              if (regionNumber < 10) {
                region = "0" + region;
              }
              String s = letters[i] + number + letters[j] + letters[k] + region;
              autoNumber.add(s);
            }
          }
        }
      }
    }
    return autoNumber;
  }

  public static boolean bruteForceSearchInList(List<String> list, String number) {

    return list.contains(number);
  }

  public static boolean binarySearchInList(List<String> sortedList, String number) {
    if (Collections.binarySearch(sortedList, number) >= 0) {
      return true;
    } else {
      return false;
    }
  }


  public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
    return hashSet.contains(number);
  }

  public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
    return treeSet.contains(number);
  }

}

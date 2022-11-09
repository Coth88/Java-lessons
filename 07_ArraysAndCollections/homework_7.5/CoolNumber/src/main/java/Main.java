import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

  public static void main(String[] args) {

    List<String> coolNumbers = CoolNumbers.generateCoolNumbers();
    HashSet<String> hashSetCoolNumbers = new HashSet<>();
    hashSetCoolNumbers.addAll(coolNumbers);
    TreeSet<String> treeSetCoolNumbers = new TreeSet<>();
    treeSetCoolNumbers.addAll(coolNumbers);
    Scanner scanner = new Scanner(System.in);

    while (true) {
      String input = scanner.nextLine();

      if (input.equals("выход") || input.equals("ВЫХОД")) {
        break;
      }

      String resultSearch = "";
      long startBruteForceSearchInList = System.nanoTime();
      CoolNumbers.bruteForceSearchInList(coolNumbers, input);
      long finshBruteForceSearchInList = System.nanoTime() - startBruteForceSearchInList;
      if (CoolNumbers.bruteForceSearchInList(coolNumbers, input)) {
        resultSearch = "номер найден";
      } else {
        resultSearch = "номер не найден";
      }
      System.out.println(
          "Поиск перебором: " + resultSearch + ", поиск занял " + finshBruteForceSearchInList
              + " нс");

      Collections.sort(coolNumbers);
      long startBinarySearchInList = System.nanoTime();
      CoolNumbers.binarySearchInList(coolNumbers, input);
      long finishBinarySearchInList = System.nanoTime() - startBinarySearchInList;
      if (CoolNumbers.binarySearchInList(coolNumbers, input)) {
        resultSearch = "номер найден";
      } else {
        resultSearch = "номер не найден";
      }
      System.out.println(
          "Бинарный поиск: " + resultSearch + ", поиск занял " + finishBinarySearchInList + " нс");

      long startSearchInHashSet = System.nanoTime();
      CoolNumbers.searchInHashSet(hashSetCoolNumbers, input);
      long finishSearchInHashSet = System.nanoTime() - startSearchInHashSet;
      if (CoolNumbers.searchInHashSet(hashSetCoolNumbers, input)) {
        resultSearch = "номер найден";
      } else {
        resultSearch = "номер не найден";
      }
      System.out.println(
          "Поиск в HashSet: " + resultSearch + ", поиск занял " + finishSearchInHashSet + " нс");

      long startSearchInTreeSet = System.nanoTime();
      CoolNumbers.searchInTreeSet(treeSetCoolNumbers, input);
      long finishSearchInTreeSet = System.nanoTime() - startSearchInTreeSet;
      if (CoolNumbers.searchInHashSet(hashSetCoolNumbers, input)) {
        resultSearch = "номер найден";
      } else {
        resultSearch = "номер не найден";
      }
      System.out.println(
          "Поиск в TreeSet: " + resultSearch + ", поиск занял " + finishSearchInTreeSet + " нс");
    }
  }
}

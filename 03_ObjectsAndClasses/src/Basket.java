public class Basket {

  private static int count = 0;
  private String items = "";
  private int totalPrice = 0;
  private int limit;
  private double totalWeight = 0;
  private int countItems = 0;


  private static int totalCountItems = 0;
  private static int fullTotalPrice = 0;


  public Basket() {
    increaseCount(1);
    items = "Список товаров:";
    this.limit = 1000000;
  }

  public Basket(int limit) {
    this();
    this.limit = limit;
  }

  public Basket(String items, int totalPrice) {
    this();
    this.items = this.items + items;
    this.totalPrice = totalPrice;
  }


  public static int getCount() {
    return count;
  }


  public static int getTotalCountItems() {
    return totalCountItems;
  }

  public static void increaseTotalCountItems(int count) {
    Basket.totalCountItems = Basket.totalCountItems + count;
  }

  public static void increaseFullTotalPrice(int count, int price) {
    Basket.fullTotalPrice = Basket.fullTotalPrice + count * price;
  }

  public static int getFullTotalPrice() {
    return fullTotalPrice;
  }

  public static void reduceFullTotalPrice(int totalPrice) {
    Basket.fullTotalPrice = Basket.fullTotalPrice - totalPrice;
  }


  public static void reduceTotalCountItems(int countItems) {
    Basket.totalCountItems = Basket.totalCountItems - countItems;
  }

  public static double averagePrice() {
    return Basket.fullTotalPrice / Basket.totalCountItems;
  }

  public static double averagePriceBasket() {
    return Basket.fullTotalPrice / Basket.count;
  }

  public static void increaseCount(int count) {
    Basket.count = Basket.count + count;
  }


  public void add(String name, int price) {
    add(name, price, 1, 0);
  }

  public void add(String name, int price, int count) {
    add(name, price, count, 0);
  }

  public void add(String name, int price, double weight) {
    add(name, price, 1, weight);
  }


  public void add(String name, int price, int count, double weight) {
    boolean error = false;
    if (contains(name)) {
      error = true;
    }

    if (totalPrice + count * price >= limit) {
      error = true;
    }

    if (error) {
      System.out.println("Error occured :(");
      return;
    }

    if (weight == 0) {
      items = items + "\n" + name + " - " +
          count + " шт. - " + price;
      totalPrice = totalPrice + count * price;
      countItems = countItems + count;
      increaseTotalCountItems(count);
      increaseFullTotalPrice(count, price);
      return;
    } else {
      items = items + "\n" + name + " - " +
          count + " шт. - " + weight + " кг - " + price;
    }
    totalPrice = totalPrice + count * price;
    totalWeight = totalWeight + count * weight;
    countItems = countItems + count;
    increaseTotalCountItems(count);
    increaseFullTotalPrice(count, price);

  }

  public void clear() {
    items = "";
    totalWeight = 0;
    reduceTotalCountItems(countItems);
    reduceFullTotalPrice(totalPrice);
    countItems = 0;
    totalPrice = 0;

  }

  public int getCountItems() {
    return countItems;
  }

  public int getTotalPrice() {
    return totalPrice;
  }

  public double getTotalWeight() {
    return totalWeight;
  }


  public boolean contains(String name) {
    return items.contains(name);
  }

  public void print(String title) {
    System.out.println(title);
    if (items.isEmpty()) {
      System.out.println("Корзина пуста");
    } else {
      System.out.println(items);
    }
  }
}

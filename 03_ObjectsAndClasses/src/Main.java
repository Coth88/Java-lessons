public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.add("Hleb", 20, 2, 2);
        basket.add("Arbuz", 120, 1, 12);
        basket.print("basket");
        System.out.println("Общий вес" + " - " + basket.getTotalWeight() + "кг");
        System.out.println("Общий прайс" + " - " + basket.getTotalPrice() + "руб");
        System.out.println("Общее количество предметов в карзине: " + basket.getCountItems());
        System.out.println("Общее количество предметов во всех карзинах: " + Basket.getTotalCountItems());
        System.out.println("Общее цена всех предметов во всех корзинах: " + Basket.getFullTotalPrice());
        System.out.println();

        Basket petr = new Basket();
        petr.add("Milk", 40);
        petr.add("Arbuz", 120, 2, 12);
        petr.print("petr");
        System.out.println("Общий вес" + " - " + petr.getTotalWeight() + "кг");
        System.out.println("Общий прайс" + " - " + petr.getTotalPrice() + "руб");
        System.out.println("Общее количество предметов в карзине: " + petr.getCountItems());
        System.out.println("Общее количество предметов во всех карзинах: " + Basket.getTotalCountItems());
        System.out.println("Общее цена всех предметов во всех корзинах: " + Basket.getFullTotalPrice());
        System.out.println("Средняя цена товара во всех корзинах: " + Basket.averagePrice());
        System.out.println("Средняя стоимость корзины: " + Basket.averagePriceBasket());
        System.out.println();
        petr.clear();
        System.out.println("Общее количество предметов в карзине: " + petr.getCountItems());
        System.out.println("Общее количество предметов во всех карзинах: " + Basket.getTotalCountItems());
        System.out.println("Общее цена всех предметов во всех корзинах: " + Basket.getFullTotalPrice());
        System.out.println("Средняя цена товара во всех корзинах: " + Basket.averagePrice());
        System.out.println("Средняя стоимость корзины: " + Basket.averagePriceBasket());



    }
}

import java.util.Scanner;

public class Main {

    public static final int MAX_BOX = 27;
    public static final int MAX_CONTAINERS = 12;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String boxes = scanner.nextLine();
        int box = 1;
        int containers = 1;
        int truck = 1;
        int x = Integer.parseInt(boxes);
        if (x == 0) {
            containers = 0;
            truck = 0;
        } else {
            System.out.println("Грузовик: " + truck);
            System.out.println("\t" + "Контейнер: " + containers);
            for (int i = 1; i <= x; i++) {
                System.out.println("\t" + "\t" + "Ящик: " + box);
                box++;
                if (box % MAX_BOX == 1) {
                    if (containers % MAX_CONTAINERS == 0) {
                        System.out.println("Грузовик: " + (++truck));


                    }
                    if (x % MAX_BOX != 0) {
                        containers++;
                        System.out.println("\t" + "Контейнер: " + containers);
                    }
                }
            }
        }
        System.out.println("Необходимо:" + System.lineSeparator() + "грузовиков" + " - " +
            truck + " шт." + System.lineSeparator() + "контейнеров" + " - " + containers + " шт.");
    }
}


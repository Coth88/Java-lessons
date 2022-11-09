public class Arithmetic {
    private static int a;
    private static int b;


    public static void main(String[] args) {

        Arithmetic result = new Arithmetic(16, 7);
        System.out.println("Сумма" + " - " + result.sum());
        System.out.println("Разность" + " - " + result.diff());
        System.out.println("Произведение" + " - " + result.product());
        System.out.println("Среднее значение" + " - " + result.average());
        result.maxNumber();
        result.minNumber();

    }


    public Arithmetic(int a, int b) {
    this.a = a;
    this.b = b;

    }

    public int sum(){
        return a+b;

    }

    public int diff(){
      return a-b;
    }

    public int product(){
      return  a*b;
    }

    public double average(){
        return  (double) (a+b) / 2;
    }

    public void maxNumber() {
        if (a == b)
            System.out.println("Числа равны");
        else
            if (a > b)
                System.out.println("Максимальное число" + " - " + a);
            else
                System.out.println("Максимальное число" + " - " + b);
    }

    public void minNumber() {
        if (a == b)
            System.out.println("Числа равны");
        else if (a > b)
            System.out.println("Минимальное число" + " - " + b);
        else
            System.out.println("Минимальное число" + " - " + a);
    }
}

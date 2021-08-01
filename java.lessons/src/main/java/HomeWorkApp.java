public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 10;
        int b = 20;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Cумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }
    public static void printColor() {
        int value;
        value = 110;

        if (value <= 0) {
            System.out.println("Красний");
        }
        if ((value > 0)&&(value <= 100))
        {
            System.out.println("Желтий");
        }
        if (value > 100)
        {
            System.out.println("Зелений");
        }
    }
    public static void compareNumbers() {
        int a = 10;
        int b = 20;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}

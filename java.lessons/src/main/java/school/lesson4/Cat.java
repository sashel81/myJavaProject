package school.lesson4;


public class Cat extends Animal {
    protected int x = 200;
    private int appetite;
    private int satiety = 0;
    private static int counter;

    public Cat(String name, int appetite) {
        super(name);
        this.appetite = appetite;
    }


    public Cat(String name) {
        super(name);
        counter++;
    }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }

    public static int getNumberOfCats() {
        return counter;
    }

    void run(int dist) {
        if (dist <= x) {
            System.out.println("Кот " + name + " пробежал: " + dist + " м");
        } else {
            System.out.println("Кот " + name + " не может пробежать больше " + x + " м");
        }
    }

    void swim(int dist) {
        System.out.println("Кот " + name + " не умеет плавать");
    }

    void eat(Plate p) {
        p.decreaseFood(appetite);
        satiety += 1;
    }

    public boolean getSatiety() {
        if (satiety != 0) {
             return true;
        } else {
            return false;

        }

    }
}




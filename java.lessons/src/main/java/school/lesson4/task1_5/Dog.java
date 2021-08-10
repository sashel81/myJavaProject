package school.lesson4.task1_5;

public class Dog extends Animal {
    protected int x = 500;
    protected int y = 10;
    private static int counter;

    public Dog(String name) {
        super(name);
        counter++;
    }
    public static int getNumberOfDogs() {
        return counter;
    }

    void run(int dist) {

        if (dist <= x) {
            System.out.println("Coбака " + name + " пробежала:" + dist + "м");
        } else {
            System.out.println("Coбака " + name + " не может бежать больше " + x + " м");
        }
    }

    void swim(int dist) {
        if (dist <= y) {
            System.out.println("Coбака" + name + " проплила: " + dist + " м");
        } else {
            System.out.println("Coбака " +name+ " не может плить больше " + y + " м");
        }
    }
}

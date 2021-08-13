package school.lesson5.task2;


import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruitList;

    public Box() {
        this.fruitList = new ArrayList<T>();
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);

    }

    public ArrayList<T> getFruitList() {
        return fruitList;
    }

    public double getWeight() {
        if (fruitList.isEmpty()) {
            return 0;
        } else {
            return (fruitList.size() * fruitList.get(0).getWeight());
        }
    }

    void info() {
        if (fruitList.isEmpty()) {
            System.out.println("Коробка пуста");
        } else {
            System.out.println("В коробке находятся " + fruitList.get(0).toString() + " в количестве: " + fruitList.size());
        }
    }

    boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }

    void moveAt(Box<T> recieverBox) {
        for (T obj : fruitList) {
            recieverBox.addFruit(obj);
        }
        fruitList.clear();
    }
}



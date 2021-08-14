package school.lesson5.task2;
//Задача:
//        1. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
//        2. Класс Box, в который можно складывать фрукты. Коробки условно сортируются
//        по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//        3. Для хранения фруктов внутри коробки можно использовать ArrayList;
//        4. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного
//        фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы
//        измерения не важны);
//        5. Внутри класса Box сделать метод compare(), который позволяет сравнить
//        текущую коробку с той, которую подадут в compare() в качестве параметра.
//        true – если их массы равны, false в противоположном случае. Можно
//        сравнивать коробки с яблоками и апельсинами;
//        6. Написать метод, который позволяет пересыпать фрукты из текущей коробки в
//        другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с
//        апельсинами. Соответственно, в текущей коробке фруктов не остается, а в
//        другую перекидываются объекты, которые были в первой;
//        7. Не забываем про метод добавления фрукта в коробку.

public class HomeWorkApp2 {

    public static void main(String[] args) {
        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox1 = new Box();
        orangeBox1.addFruit(new Orange(), 4);
        orangeBox1.addFruit(new Orange(), 1);
        orangeBox1.addFruit(new Orange(), 1);
        orangeBox2.addFruit(new Orange(), 1);
        orangeBox2.addFruit(new Orange(), 1);
        orangeBox2.addFruit(new Orange(), 1);
        appleBox1.addFruit(new Apple(), 1);
        appleBox1.addFruit(new Apple(), 1);

        System.out.println("Вес коробки 1 с апельсинами:" + orangeBox1.getWeight());
        System.out.println("Вес коробки 2 с апельсинами:" + orangeBox2.getWeight());
        System.out.println("Вес коробки 1 с яблоками:" + appleBox1.getWeight());

        System.out.println("Сравнить вес orangeBox1 и appleBox1: " + orangeBox1.compare(appleBox1));
        System.out.println("Сравнить вес orangeBox2 и appleBox1: " + orangeBox2.compare(appleBox1));
        System.out.println("Сравнить вес orangeBox2 и orangeBox1: " + orangeBox2.compare(orangeBox1));
        orangeBox1.moveAt(orangeBox2);
        System.out.println("Вес коробки 1 с апельсинами:" + orangeBox1.getWeight());
        System.out.println("Вес коробки 2 с апельсинами:" + orangeBox2.getWeight());
        System.out.println(orangeBox1.getFruitList());
        System.out.println(orangeBox2.getFruitList());
        System.out.println(appleBox1.getFruitList());
    }

}




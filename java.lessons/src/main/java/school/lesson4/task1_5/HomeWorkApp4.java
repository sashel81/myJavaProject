package school.lesson4.task1_5;


//      Домашнее задание 4: Галенко Александра
//
////       1. Создать классы Собака и Кот с наследованием от класса Животное.
////
////        2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
////
////        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
////
////        4. * Добавить подсчет созданных котов, собак и животных.

public class HomeWorkApp4 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("nana");
        Animal animal2 = new Animal("tata");
        Cat cat1 = new Cat ("Nene");
        Cat cat2 = new Cat ("BeBe");
        animal1.run(5);
        animal2.run(10);
        animal1.swim(6);
        cat1.swim(66);
        cat2.run(600);
        Dog dog1 = new Dog ("PePe");
        Dog dog2 = new Dog ("KeKe");
        dog1.run(700);
        System.out.println("Всего животних:" + Animal.getNumberOfAnimals());
        System.out.println("Из них котов:" + Cat.getNumberOfCats());
        System.out.println("Из них собак:" + Dog.getNumberOfDogs());

    }
}


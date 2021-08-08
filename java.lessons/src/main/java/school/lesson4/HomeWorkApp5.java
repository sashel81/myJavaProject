package school.lesson4;

import school.lesson3.Employee;

//      Домашнее задание 4: Галенко Александра
//
//        5. Расширить задачу про котов и тарелки с едой, выполнив следующие пункты:
//
//        Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
//
//        Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
//
//        Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
//
//        Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
//
//        Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
public class HomeWorkApp5 {
    public static void main(String[] args) {

        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Сарделька", 6);
        cat[1] = new Cat("Василий", 10);
        cat[2] = new Cat("Пушок", 8);
        cat[3] = new Cat("Мурзик", 7);
        cat[4] = new Cat("Снежок", 9);
        Plate plate = new Plate(30);
        for (Cat Cat : cat) {
            if ((Plate.getFood() - Cat.getAppetite()) >= 0) {
                Cat.eat(plate);
                if (Cat.getSatiety()) {
                    System.out.println("Кот " + Cat.getName() + " сыт " + Cat.getSatiety());
                }
            } else {
                System.out.println("В тарелке не достаточно еды");
                if (!Cat.getSatiety()) {

                    System.out.println("Кот " + Cat.getName() + " сыт " + Cat.getSatiety());
                }
                plate.increaseFood(20);
                Cat.eat(plate);
                System.out.println("Кот " + Cat.getName() + " сыт " + Cat.getSatiety());
            }
        }
    }
}
//      Домашнее задание 3: Галенко Александра
//        1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//
//
//        2. Конструктор класса должен заполнять эти поля при создании объекта.
//
//
//        3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//
//
//        4. Создать массив из 5 сотрудников.
//        5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
package school.lesson3;
public class HomeWorkApp3 {


    public static void main(String[] args) {
        Employee[] empArr = new Employee[5];
        empArr[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 50000, 47);
        empArr[1] = new Employee("Petrov Petr", "Creator", "petrov@mailbox.com", "892312314", 50000, 32);
        empArr[2] = new Employee("Sidorov Sidr", "Sheef", "sidorov@mailbox.com", "892312315", 10000, 47);
        empArr[3] = new Employee("Pupkina Nadegda", "Developer", "pupkina@mailbox.com", "892312316", 5000, 18);
        empArr[4] = new Employee("Juk J", "Helper", "juk@mailbox.com", "892312317", 3000, 21);


        for(Employee employee: empArr) {
            employee.info();
        }
                 System.out.println("Cотрудники старше 40 лет:");
        for (Employee employee: empArr) {
            if (employee.getAge() > 40) {
                employee.info();
            }
        }
    }
}


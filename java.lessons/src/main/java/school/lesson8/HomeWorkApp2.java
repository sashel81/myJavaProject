package school.lesson8;

import java.util.HashMap;

//2. Написать простой класс Телефонный Справочник, который хранит в себе список
//        фамилий и телефонных номеров. В этот телефонный справочник с помощью метода
//        add() можно добавлять записи, а с помощью метода get() искать номер телефона по
//        фамилии. Следует учесть, что под одной фамилией может быть несколько
//        телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны
//        выводиться все телефоны
public class HomeWorkApp2 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Peter Hyder", "01010104440102");
        phoneBook.add("Peter Hyder", "01010104440103");
        phoneBook.add("Stiven Bunny", "010101010444104");
        phoneBook.add("Solomia Retro", "01010104440105");
        phoneBook.get("Peter Hyder");
        phoneBook.get("Stiven Bunny"); 


    }
}

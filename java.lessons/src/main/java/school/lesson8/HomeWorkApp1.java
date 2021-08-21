package school.lesson8;

import java.util.*;

//       1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
//        Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не
//        считаем). Посчитать, сколько раз встречается каждое слово
public class HomeWorkApp1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Anna", "Polo", "Denja",
                "Anna", "Anton", "Kolja", "Peter", "Peter", "Boris", "Olga", "Marina", "Anton", "Polo"));
        Set<String> set = new HashSet<>(list);
        System.out.println("Unique words:" + set);
        for (String uniqueVal : set) {
            Iterator<String> iter1 = list.iterator();
            int counter = 0;
            while (iter1.hasNext()) {
                String str1 = iter1.next();
                if (uniqueVal.equals(str1)) {
                    counter++;
                }
            }
            System.out.println(uniqueVal + " : " + counter + " items");
        }

    }
}
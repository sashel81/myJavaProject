package school.lesson5.task1;
//1. Написать метод, который меняет два элемента массива местами (массив может быть
//   любого ссылочного типа);

import java.util.Arrays;

public class HomeWorkApp1 {

    public static void main(String[] args) {

        String[] arr1 = {"anna", "petr", "olha", "tomas"};
        Integer[] arr2 = {3, 4, 10, 4, -13, 11};

        System.out.println(Arrays.toString(arr1));
        changeElements(arr1, 1, 2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        changeElements(arr2, 1, 2);
        System.out.println(Arrays.toString(arr2));
    }

    private static <T> void changeElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
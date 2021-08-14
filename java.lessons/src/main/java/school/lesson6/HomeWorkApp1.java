package school.lesson6;



//       1. Напишите метод, на вход которого подаётся двумерный строковый массив
//        размером 4х4. При подаче массива другого размера необходимо бросить
//        исключение MyArraySizeException.
//        2. Далее метод должен пройтись по всем элементам массива, преобразовать в
//        int и просуммировать. Если в каком-то элементе массива преобразование не
//        удалось (например, в ячейке лежит символ или текст вместо числа), должно быть
//        брошено исключение MyArrayDataException с детализацией, в какой именно
//        ячейке лежат неверные данные.
//        3. В методе main() вызвать полученный метод, обработать возможные
//        исключения MyArraySizeException и MyArrayDataException и вывести результат
//        расчета.
public class HomeWorkApp1 {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
//        правильний массив
//        String[][] arr = {{"1", "2", "3", "4"}, {"2", "2", "2", "3"}, {"1", "2", "8", "2"}, {"2", "2", "2", "2"}};

//        неправильний елемент массива
//      String[][] arr = {{"1", "2", "3", "4"}, {"2", "2", "2", "3"}, {"1", "2", "sasa", "2"}, {"2", "2", "2", "2"}};

//        неправильний размер массива
        String[][] arr = {{"1", "2", "3", "4", "5"}, {"2", "2", "2", "3", "5"}, {"1", "2", "sasa", "2", "6"}, {"2", "2", "2", "2", "6"}};

        try {
            System.out.println("Cумма елементов массива arr =  " + method(arr));
        } catch (MyArraySizeException e) {
            System.out.println("Размер массива не соответствует [4]x[4]");
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }
    }

    public static int method(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    count += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return count;
    }
}

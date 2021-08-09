package school.lesson2;

import java.util.Scanner;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи числа х1 и х2:");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        within10and20(x1, x2);
        System.out.println("Введи число х:");
        int x = sc.nextInt();
        isPositiveOrNegative(x);
        System.out.println("Введи число х:");
        x = sc.nextInt();
        isNegative(x);
        System.out.println("Введи cтроку:");
        String word = sc.next();
        System.out.println("Введи число х:");
        int times = sc.nextInt();
        printWordNTimes(word, times);
        System.out.println("Введи год:");
        int year = sc.nextInt();
        isYearLeap(year);
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        System.out.println("Введи числа len и initialValue:");
        int len = sc.nextInt();
        int initialValue = sc.nextInt();
        builtArray(len, initialValue);
        maxAndMinOfArray();
        checkBalanceArray();
    }

    public static boolean within10and20(int x1, int x2) {
        int c = x1 + x2;
        if ((c >= 10) && (c <= 20)) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Число х положительное");
        } else {
            System.out.println("Число х отрицательное");
        }
    }

    public static boolean isNegative(int x) {

        if (x < 0) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

    public static boolean isYearLeap(int year) {

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("The year is leap");
                    return true;
                } else {
                    System.out.println("The year is not leap");
                    return false;
                }

            } else {
                System.out.println("The year is leap");
                return true;
            }
        } else {
            System.out.println("The year is not leap");
            return false;
        }
    }

    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] += 1;
            } else {
                arr[i] -= 1;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                if (i == j) {
                    arr[i][j] = 1;
                    System.out.print(arr[i][j]);
                } else {
                    System.out.print("[]");
                }
            System.out.println();
        }
    }

    public static void builtArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }

    }

    public static void maxAndMinOfArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Максимальний елемент массива max =" + max);
        System.out.println("Минимальний елемент массива min =" + min);
    }

    public static boolean checkBalanceArray() {
        boolean found = false;
        int[] arr = {1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 4};
        int sumLeft = arr[0] + arr[1];
        int sumRight = 0;

        for (int i = arr.length - 1; i > 1; i--) {

            sumRight += arr[i];
        }
        for (int j = 2; j < arr.length - 2; j++) {
            sumLeft += arr[j];
            sumRight -= arr[j];
//            System.out.println(Integer.toString(sumLeft) + " " + Integer.toString(sumRight));
            if (sumLeft == sumRight) {
                System.out.println(true);
                found = true;
                break;

            } else {
                found = false;
            }
        }
        return found;
    }


}





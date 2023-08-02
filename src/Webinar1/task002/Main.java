package Webinar1.task002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 3, 4, 0, 0, 9, 6 };
        dialog(arr);
    }

    private static void dialog(int[] arr) {
        System.out.println("Введите искомое число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        parseCode(checkArray(arr, num));
        scanner.close();
    }

    private static void parseCode(int code) {
        switch (code) {
            case -1:
                System.out.println("Длина массива меньше минимального значений.");
                break;
            case -2:
                System.out.println("Искомый элемент не найден.");
                break;
            case -3:
                System.out.println("Массив не инициализирован.");
                break;
            default:
                System.out.println("Индекс элемента: " + code);
                break;
        }
    }

    private static int checkArray(int[] arr, int num) {
        if (arr == null) {
            return -3;
        }
        int minLength = 10;
        if (arr.length < minLength) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -2;
    }
}

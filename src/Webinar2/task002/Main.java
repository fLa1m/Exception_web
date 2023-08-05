package Webinar2.task002;

import java.util.Scanner;

public class Main {
    public static void ex0() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
        int index = scanner.nextInt();
        // unchecked исключения нужно стараться не допускать в коде, следовательно их не
        // нужно отлавливать
        if (index < arr.length && index >= 0) {
            arr[index] = 1;
        } else {
            System.out.println("Указан индекс за пределами массива");
        }
        // try {
        // arr[index] = 1;
        // } catch (Exception e) {
        // System.out.println("Указан индекс за пределами массива");
        // }
        scanner.close();
    }
}

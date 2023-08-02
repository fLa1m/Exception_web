package Webinar1.task003;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[][] { { 1, 0, 0 }, { 0, 0 }, { 0, 0, 0 } };
        try {
            System.out.println("Сумма элементов массива равна: " + sumArrayItems(array));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }

    private static int sumArrayItems(int[][] array) {
        if (array == null) {
            throw new RuntimeException("Массив не инициализирован.");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length) {
                throw new RuntimeException("Массив не квадратный.");
            }
            for (int j = 0; j < array[i].length; j++) {
                int item = array[i][j];
                if (item != 0 && item != 1) {
                    throw new RuntimeException(
                            "Элемент с индексом [" + i + ", " + j + "] = " + item + ". Ожидается 0 или 1.");
                }
                sum += item;
            }
        }
        return sum;
    }
}

package Webinar3.task005;

public class Main {
    public static void main(String[] args) {
        String[][] array = new String[][] { { "1", "2", "3", "4" }, { "1", "2", "3", "4" }, { "1", "2", "3", "4" },
                { "1", "2", "3", "4" } };
        try {
            System.out.println(sumArray(array));
        } catch (MyArraySizeException | MyArrayDataException e) { // (IllegalArgumentException e)
            e.printStackTrace();
        }
    }

    static int sumArray(String[][] arr) {
        int result = 0;
        int defaultSize = 4;
        if (arr.length != defaultSize) {
            throw new MyArraySizeException("Проверьте размер массива.");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != defaultSize) {
                throw new MyArraySizeException("Проверьте размер массива.");
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    result += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не верный формат данных в массиве на позиции:" + i + ", " + j);
                }
                // if (!arr[i][j].matches("[0-9]+")) {
                // throw new MyArrayDataException("text");
                // }
                // result += Integer.parseInt(arr[i][j]);
            }
        }
        return result;
    }
}

package Webinar2.task003;

public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[][] { { "1", "2", "3" }, { "asdf", "66", "42" } };
    }

    public static int ex2(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (checkText(arr[i][j])) { // arr[i][j].matches("[0-9]+") - регулярное выражение
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
        }
        return sum;
    }

    private static boolean checkText(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}

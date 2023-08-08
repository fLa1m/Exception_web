package Webinar3.task004;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(div(6, 0));
        } catch (DevisionByZeroException e) {
            e.printStackTrace();
        }
    }

    static double div(int a, int b) {
        if (b == 0) {
            throw new DevisionByZeroException("На ноль делить нельзя!");
        }
        return a / b;
    }
}

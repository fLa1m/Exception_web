package Webinar3.task003;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (Counter counter = new Counter();) {
            counter.add();
            counter.add();
            System.out.println(counter.isClosed());
            System.out.println(counter.getCount());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

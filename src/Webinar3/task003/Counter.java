package Webinar3.task003;

import java.io.IOException;

public class Counter implements AutoCloseable {
    private int count;
    private boolean closed;

    public void add() throws IOException {
        if (closed) {
            throw new IOException("Ресурс закрыт");
        }
        count++;
    }

    @Override
    public void close() {
        closed = true;
        System.out.println("Закрыли ресурс.");
    }

    public boolean isClosed() {
        return closed;
    }

    public int getCount() {
        return count;
    }

}

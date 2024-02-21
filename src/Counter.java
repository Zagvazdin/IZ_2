public class Counter implements AutoCloseable {
    private int count = 0;

    public void add() {
        count++;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Счетчик остоновлен.");
    }
}

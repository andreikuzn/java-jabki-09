package classwork;

import java.util.Arrays;

public class ProArrayList {

    private static final int DEFAULT_CAPACITY = 10;

    private String[] data;

    private int size;

    public ProArrayList() {
        this.data = new String[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void add(String element) {
        provideCapacity();
        this.data[this.size++] = element;
    }

    // TODO
    public int size() {
        return 0;
    }

    // TODO
    public void add(int index, String element) {

    }

    // TODO
    public String get(int index) {
        return null;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.stream(this.data).limit(this.size).toArray());
    }

    private void provideCapacity() {
        if (this.size >= this.data.length) {
            grow();
        }
    }

    private void grow() {
        int newCapacity = this.data.length * 2;
        this.data = Arrays.copyOf(this.data, newCapacity);
    }
}

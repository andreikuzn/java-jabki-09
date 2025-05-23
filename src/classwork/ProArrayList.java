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

    // Возвращает количество элементов
    public int size() {
        return this.size;
    }

    // Добавляет элемент по индексу, сдвигая элементы справа от этого индекса на одну позицию правее
    public void add(int index, String element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        provideCapacity();
        System.arraycopy(data, index, data, index + 1, size - index);
        data[index] = element;
        size++;
    }

    // Возвращает элемент по индексу
    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return data[index];
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

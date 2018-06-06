package app.bubble_sort;

public class BubbleSort {

    private long[] array;

    private int size;

    public BubbleSort(final int num) {
        array = new long[num];
        size = 0;
    }

    public void insert(final long element) {
        array[size] = element;
        size++;
    }

    public void display() {
        for (int i = 0; i < size; i++) System.out.print(array[i] + " ");
        System.out.println();
    }

    public void bubbleSort() {
        for (int i = size - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) swap(j, j + 1);
            }
        }
    }

    public void swap(final int i, final int i2) {
        long tmp = array[i];
        array[i] = array[i2];
        array[i2] = tmp;
    }

}

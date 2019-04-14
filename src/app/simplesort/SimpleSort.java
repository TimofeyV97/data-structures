package app.simplesort;


public abstract class SimpleSort {

    protected long[] array;

    protected int size;

    public SimpleSort(final int num) {
        array = new long[num];
        size = 0;
    }

    public void insert(final long element) {
        array[size] = element;
        size++;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    public abstract void sort();

    protected void swap(final int i, final int i2) {
        long tmp = array[i];
        array[i] = array[i2];
        array[i2] = tmp;
    }

}

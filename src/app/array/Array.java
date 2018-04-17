package app.array;


public class Array<T> {

    private T[] array;

    private int size;

    public Array(final int num) {
        array = (T[]) new Object[num];
        size = 0;
    }

    public boolean find(final T element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) return true;
        }

        return false;
    }

    public void insert(final T element) {
        array[size] = element;
        size++;
    }

    public boolean remove(final T element) {
        int i;

        for (i = 0; i < size; i++) {
            if (array[i] == element) break;
        }

        if (i == size) return false;
        else {
            for (int k = i; k < size - 1; k++) array[k] = array[k + 1];

            size--;

            return true;
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) System.out.print(array[i] + " ");
        System.out.println();
    }

}

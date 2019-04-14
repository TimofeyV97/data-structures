package app.orderedarray;


public class OrderedArray {

    private long[] array;

    private int size;

    public OrderedArray(final int num) {
        array = new long[num];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public int find(final long element) {
        int lowerBound = 0;
        int upperBound = size - 1;
        int current;

        while (true) {
            current = (lowerBound + upperBound) / 2;

            if (array[current] == element) {
                return current;
            } else if (lowerBound > upperBound) {
                return size;
            } else {
                if (array[current] < element) {
                    lowerBound = current + 1;
                } else upperBound = current - 1;
            }
        }
    }

    public void insert(final long element) {
        int i;

        for (i = 0; i < size; i++) {
            if (array[i] > element) {
                break;
            }
        }

        for (int k = size; k > i; k--) {
            array[k] = array[k - 1];
        }

        array[i] = element;
        size++;
    }

    public boolean remove(final long element) {
        int i = find(element);

        if (i == size) {
            return false;
        } else {
            for (int k = i; k < size - 1; k++) {
                array[k] = array[k + 1];
            }

            size--;
        }

        return true;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

}

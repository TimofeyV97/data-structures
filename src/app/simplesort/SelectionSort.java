package app.simplesort;


public class SelectionSort extends SimpleSort {

    public SelectionSort(final int num) {
        super(num);
    }

    @Override
    public void sort() {
        int min;

        for (int i = 0; i < size - 1; i++) {
            min = i;

            for (int j = i + 1; j < size; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            swap(i, min);
        }
    }

}

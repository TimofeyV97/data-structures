package app.simple_sort;


public class BubbleSort extends SimpleSort {

    public BubbleSort(final int num) {
        super(num);
    }

    @Override
    public void sort() {
        for (int i = size - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) swap(j, j + 1);
            }
        }
    }

}

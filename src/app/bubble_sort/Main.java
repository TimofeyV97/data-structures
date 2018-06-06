package app.bubble_sort;


public class Main {

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort(10);

        bs.insert(10);
        bs.insert(20);
        bs.insert(5);
        bs.insert(77);
        bs.insert(50);
        bs.insert(110);
        bs.insert(81);
        bs.insert(40);
        bs.insert(2);
        bs.insert(100);

        bs.display();

        bs.bubbleSort();

        bs.display();
    }

}

package app.simple_sort;


public class Main {

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort(10);
        SelectionSort ss = new SelectionSort(10);

        System.out.println("Bubble sort:");
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
        bs.sort();
        bs.display();

        System.out.println("\nSelection sort:");
        ss.insert(10);
        ss.insert(20);
        ss.insert(5);
        ss.insert(77);
        ss.insert(50);
        ss.insert(110);
        ss.insert(81);
        ss.insert(40);
        ss.insert(2);
        ss.insert(100);
        ss.display();
        ss.sort();
        ss.display();
    }

}

package app.orderedarray;


public class Main {

    public static void main(String[] args) {
        final OrderedArray orderedArray = new OrderedArray(100);

        orderedArray.insert(23);
        orderedArray.insert(12);
        orderedArray.insert(98);
        orderedArray.insert(1200);
        orderedArray.insert(567);
        orderedArray.insert(100);
        orderedArray.insert(51);

        orderedArray.display();

        if (orderedArray.find(12) != orderedArray.getSize()) System.out.println("Found");
        else System.out.println("Not found");

        orderedArray.remove(100);
        orderedArray.remove(1200);
        orderedArray.remove(98);

        if (orderedArray.find(100) != orderedArray.getSize()) System.out.println("Found");
        else System.out.println("Not found");

        orderedArray.display();
    }

}

package app.array;


public class Main {

    public static void main(String[] args) {
        final Array<Integer> array = new Array<>(6);

        array.insert(2);
        array.insert(15);
        array.insert(23);
        array.insert(34);
        array.insert(100);
        array.insert(10);

        array.display();

        if (array.find(34)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }

        array.remove(23);
        array.remove(2);
        array.remove(10);

        array.display();
    }

}

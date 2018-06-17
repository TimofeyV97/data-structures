package app.linked_list;


public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add(15, "data");
        linkedList.add(20, "data");
        linkedList.add(30, "data");

        linkedList.printElements();
    }

}

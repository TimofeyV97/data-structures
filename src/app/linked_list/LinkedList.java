package app.linked_list;


public class LinkedList {

    private Link head;

    public LinkedList() {
        head = null;
    }

    public void add(final int iData, final String sData) {
        final Link link = new Link(iData, sData);

        link.setNext(head);
        head = link;
    }

    public void printElements() {
        Link current = head;

        while (current != null) {
            current.printElement();
            current = current.getNext();
        }
    }

}

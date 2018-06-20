package app.linked_list;


public class Link {

    private int iData;

    private String sData;

    private Link next;

    public Link(final int iData, final String sData) {
        this.iData = iData;
        this.sData = sData;
    }

    public int getIData() {
        return iData;
    }

    public String getSData() {
        return sData;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(final Link next) {
        this.next = next;
    }

    public void printElement() {
        System.out.println(iData + ", " + sData);
    }

}

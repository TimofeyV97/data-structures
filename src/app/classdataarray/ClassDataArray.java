package app.classdataarray;


public class ClassDataArray {

    private Person[] array;

    private int size;

    public ClassDataArray(final int num) {
        array = new Person[num];
        size = 0;
    }

    public Person find(final String lastName) {
        int i;

        for (i = 0; i < size; i++) {
            if (array[i].getLastName().equals(lastName)) break;
        }

        if (i == size) return null;
        else return array[i];
    }

    public void insert(final String lastName, final String firstName, final int age) {
        array[size] = new Person(lastName, firstName, age);
        size++;
    }

    public boolean remove(final String lastName) {
        int i;

        for (i = 0; i < size; i++) {
            if (array[i].getLastName().equals(lastName)) break;
        }

        if (i == size) return false;
        else {
            for (int k = i; k < size - 1; k++) array[k] = array[k + 1];

            size--;

            return true;
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) array[i].display();
    }

}

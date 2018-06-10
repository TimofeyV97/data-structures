package app.class_data_array;


public class Main {

    public static void main(String[] args) {
        final ClassDataArray cda = new ClassDataArray(100);

        cda.insert("Evans", "Patty", 35);
        cda.insert("Smith", "Tom", 25);
        cda.insert("Yee", "Max", 30);
        cda.insert("Adams", "Nick", 22);
        cda.insert("Vang", "Minh", 26);

        cda.display();

        if (cda.find("Smith") != null) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }

        cda.remove("Smith");
        cda.remove("Evans");

        cda.display();
    }

}

package app.class_data_array;


public class Person {

    private final String lastName;

    private final String firstName;

    private final int age;

    public Person(final String lastName, final String firstName, final int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void display() {
        System.out.print("Last name: " + lastName);
        System.out.print(", First name: " + firstName);
        System.out.println(", Age: " + age);
    }

}

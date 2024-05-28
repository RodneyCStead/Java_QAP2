// Class for a Person, this class is linked to the address, Money, and CreditCard classes
// Written on: May 28, 2024
// Written by: Rodney Stead

package Problem3;

public class Person {
    private String lastName;
    private String firstName;
    private Address home = new Address();

    // constructors
    public Person() {
        this.lastName = "";
        this.firstName = "";
        this.home = new Address();
    }

    public Person(String lastName, String firstName, Address home) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }

    
    // toString method
    public String toString() {
        return firstName + " " + lastName + "\n" + home.toString();
    }
    
}

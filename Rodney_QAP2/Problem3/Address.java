// Class for an address, this class is linked to the Person, Money, and CreditCard classes
// Written on: May 28, 2024
// Written by: Rodney Stead

package Problem3;

public class Address {
    
    // Instance variables
    private String street;
    private String city;
    private String state;
    private String zip;

    // Constructors
    public Address() {
        this.street = "";
        this.city = "";
        this.state = "";
        this.zip = "";
    }

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }


    // toString method
    public String toString() {
        return street + ", " + city + ", " + state + " " + zip;
    }
}

// This is code to test the CreditCard, Money, Person, and Address classes. The code creates a new person and credit card, 
// displays the credit card information, and then performs a series of transactions. The code then displays the updated 
// balance after each transaction. The code demonstrates the use of the CreditCard, Money, Person, and Address classes 
// to create a simple credit card system.

// Written on: May 28, 2024
// Written by: Rodney Stead

package Problem3;

public class CreditCardDemo {

    public static void main(String[] args) {

        // Set up the variables
        final Money LIMIT = new Money(1000);
        final Money FIRST_AMOUNT = new Money(200);
        final Money SECOND_AMOUNT = new Money(10.02);
        final Money THIRD_AMOUNT = new Money(25);
        final Money FOURTH_AMOUNT = new Money(990);
        System.out.println();

        // Create a new person and credit card
        Person owner = new Person ("Christie", "Diane", new Address("237j Harvey Hall", "Menomonie", "WI", "54751"));
        CreditCard visa = new CreditCard(owner, LIMIT);
        
        // Display the credit card information and balnace and credit limit
        System.out.println(visa.getPersonals());
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Credit Limit: " + visa.getCreditLimit());
        System.out.println();
        
        // Credit card transactions
        System.out.println("Attempt to charge " + FIRST_AMOUNT);
        visa.charge(FIRST_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());
        
        System.out.println("Attempt to charge " + SECOND_AMOUNT);
        visa.charge(SECOND_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());
        
        System.out.println("Attempt to pay " + THIRD_AMOUNT);
        visa.payment(THIRD_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());
       
        System.out.println("Attempt to charge " + FOURTH_AMOUNT);
        visa.charge(FOURTH_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());
    
    }
}

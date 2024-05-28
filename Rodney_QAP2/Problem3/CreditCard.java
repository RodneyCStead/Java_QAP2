// Class for CreditCard, this class is linked to the Person, Money, and Address classes. This is the main Class that ties together the other 3 classes
// Written on: May 28, 2024
// Written by: Rodney Stead

package Problem3;

public class CreditCard {

    // Instance variables
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // Constructors
    public CreditCard (Person newCardHolder, Money limit)
    {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit);
        this.balance = new Money(0);
    }
    
    // Getters and setters
    public Money getBalance()
    {
        return balance;
    }

    public Money getCreditLimit()
    {
        return creditLimit;
    }

    public String getPersonals ()
    {
        return owner.toString();
    }

    // Methods to charge and pay
    public void charge(Money amount) {
        Money newBalance = balance.add(amount);
        if (newBalance.compareTo(new Money(1000)) <= 0) {
            balance = newBalance;
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    public void payment(Money amount)
    {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
    
}

// Class for an Money, this class is linked to the Person, Address, and CreditCard classes
// Written on: May 28, 2024
// Written by: Rodney Stead

package Problem3;

public class Money {

    // Instance variables
    private long dollars;
    private long cents;

    // Constructors
    public Money (double amount) 
    {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - dollars) * 100); // Had to round in order to get the correct value
    }

    public Money (Money otherObject)
    {
        this.dollars =  otherObject.dollars;
        this.cents =  otherObject.cents;
    }


    // Method to add
    public Money add(Money otherAmount)
    {
        Money sum = new Money(0);
        sum.dollars = this.dollars + otherAmount.dollars;
        sum.cents = this.cents + otherAmount.cents;
        if (sum.cents >= 100)
        {
            sum.dollars++;
            sum.cents -= 100;
        }
        return sum;
    }


    // Method to subtract
    public Money subtract(Money amount)
    {
        Money difference = new Money(0);
        if (this.cents < amount.cents)
        {
            this.dollars--;
            this.cents += 100;
        }
        difference.dollars = this.dollars - amount.dollars;
        difference.cents = this.cents - amount.cents;
        return difference;
    }

    // Method to compare
    public int compareTo(Money otherObject)
    {
        int value;
        if (this.dollars < otherObject.dollars) 
        {
            value = -1;
        }
        else if (this.dollars > otherObject.dollars)
        {
            value = 1;
        }
        else if (this.cents < otherObject.cents)
        {
            value = -1;
        }
        else if (this.cents > otherObject.cents)
        {
            value = 1;
        }
        else
        {
            value = 0;
        }
        return value;
    }

    // Method to check if the objects are equal
    public boolean equals(Money otherObject)
    {
        return (this.dollars == otherObject.dollars && this.cents == otherObject.cents);
    }

    // toString method that returns the amount of cents to 2 decimal points
    public String toString()
    {
        return "$" + dollars + "." + String.format("%02d", cents);
    }
    
}

public class PhoneBookEntry
{
    //the variables that will store the contact the details
    public String fullName;
    public long phoneNumber;
    public String email;
    public String address;

    //this section is called upon when the instance of the class is created, and then assigns each one of the variables
    public PhoneBookEntry(String name, long number, String link, String address1)
    {
        setFullName(name);
        setPhoneNumber(number);
        setEmail(link);
        setAddress(address1);
    }

    //sets the variable full name to the name entered
    public void setFullName(String name)
    {
        this.fullName = name;
    }

    //returns the value stored in full name
    public String getFullName()
    {
        return this.fullName;
    }

    //sets the phone number for the contact
    public void setPhoneNumber(long number)
    {
        this.phoneNumber = number;
    }

    //returns the value stored in phone number
    public Long getPhoneNumber()
    {
        return (this.phoneNumber);
    }

    //sets the email for the contact
    public void setEmail (String link)
    {
        this.email = link;
    }

    //returns the email
    public String getEmail()
    {
        return this.email;
    }

    //sets the address for the contact
    public void setAddress(String address1)
    {
        this.address = address1;
    }

    //returns the address
    public String getAddress()
    {
        return this.address;
    }
}

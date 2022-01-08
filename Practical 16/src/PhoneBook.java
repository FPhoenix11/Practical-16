import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook
{
    //creates a hashmap of the phone book that will use the full name as the key for the contact and the rest stored
    //in the class PhoneBookEntry, by creating a new instance each time
    public HashMap <String, PhoneBookEntry> phoneBook = new HashMap<String, PhoneBookEntry>();

    public PhoneBook()
    {

    }

    //used to create a new entry into the phonebook
    public void newEntry()
    {
        boolean checker = true;
        String nameEntry = "";
        Scanner inputDetecter = new Scanner(System.in);

        //this while loop is used to make sure the full name isn't used twice and make the user put in a new name
        //if the name is already stored inside the variable
        while (checker == true)
        {
            System.out.println("Please enter the name of the person that will be stored in the system");
            nameEntry = null;

            nameEntry = inputDetecter.nextLine();

            if (phoneBook.containsValue(nameEntry) == true)
            {
                System.out.println("This name is already in the phonebook");
            }
            else
            {
                checker = false;
            }
        }

        //these lines are just to get the rest of the relevant information for the phonebook
        System.out.println("Please enter the phone number for this new entry: ");
        long phoneNumber = inputDetecter.nextLong();
        inputDetecter.nextLine();
        System.out.println("Please enter the email for this new entry: ");
        String email = inputDetecter.nextLine();
        System.out.println("Please enter the post code for this new entry: ");
        String address = inputDetecter.nextLine();

        //creates a new entry into the hashtable
        phoneBook.put(nameEntry, new PhoneBookEntry(nameEntry,phoneNumber,email,address));
    }

    //this lists all entries in the hashtable
    public void listBook ()
    {
        for (String i : phoneBook.keySet())
        {
            System.out.println("Name: " + i + " Phone Number: " + phoneBook.get(i).getPhoneNumber()
            + " Email: " + phoneBook.get(i).getEmail() + " Address: " + phoneBook.get(i).getAddress());
        }
    }

    //this will be used to update an existing entry in the phonebook
    public void updateBook()
    {
        boolean checker = true;
        String nameEntered = "";
        Scanner inputDetector = new Scanner(System.in);
        //used to check to see if the name is indeed in the phonebook, if not gets the user to input in the contact
        //name they wish to change
        while (checker == true)
        {
            System.out.println("Enter the name that you want to change their contact ");
            nameEntered = inputDetector.nextLine();
            if (phoneBook.containsKey(nameEntered) == true) {
                checker = false;
            }
            else
            {
                System.out.println("Name isn't in the phone book");
            }
        }

        checker = true;
        int optionSelected;

        //this while loop is used to determine part of the contact they wish to change and will loop until a valid
        //number is inputted
        while (checker == true)
        {
            System.out.println("Select one of the options that you wish to edit");
            System.out.println("1 - Name");
            System.out.println("2 - Phone Number");
            System.out.println("3 - Email");
            System.out.println("4 - Address");

            optionSelected = inputDetector.nextInt();
            inputDetector.nextLine();

            //this will update the name of the user by creating a new instance in the hashmap and deleting the old one
            if (optionSelected == 1)
            {
                System.out.println("What is the new name you wish to enter?");
                String newName = inputDetector.nextLine();

                phoneBook.put(newName, new PhoneBookEntry(newName,phoneBook.get(nameEntered).getPhoneNumber(), phoneBook.get(nameEntered).getEmail(), phoneBook.get(nameEntered).getAddress()));
                phoneBook.remove(nameEntered);
                checker = false;
            }

            //this option will change the phone number of the contact
            if (optionSelected == 2)
            {
                System.out.println("What is the new number you wish to enter?");
                Long newNumber = inputDetector.nextLong();

                phoneBook.get(nameEntered).setPhoneNumber(newNumber);
                checker = false;
            }

            //this option will change the email of the contact
            if (optionSelected == 3)
            {
                System.out.println("What is the new email you wish to enter");
                String newEmail = inputDetector.nextLine();

                phoneBook.get(nameEntered).setEmail(newEmail);
                checker = false;
            }

            //this option will change the address of the contact
            if (optionSelected == 4)
            {
                System.out.println("What is the new address you wish to enter");
                String newAddress = inputDetector.nextLine();

                phoneBook.get(nameEntered).setAddress(newAddress);
                checker = false;
            }
        }
    }

    //this will delete a contact completely from the phonebook
    public void removeBook()
    {
        boolean checker = true;
        String nameEntered = "";
        Scanner inputDetector = new Scanner(System.in);
        while (checker == true)
        {
            System.out.println("Enter the name that you want to remove ");
            nameEntered = inputDetector.nextLine();
            if (phoneBook.containsKey(nameEntered) == true) {
                checker = false;
            }
            else
            {
                System.out.println("Name isn't in the phone book");
            }
        }

        phoneBook.remove(nameEntered);
    }
}

import java.util.Scanner;

public class User
{
    //the main method of the User class
    public static void main(String[] args)
    {
        //creates a new instance of the phone book class, this will be user to store all contact information
        PhoneBook userBook = new PhoneBook();

        //this while loop is basically just so the user can choose what they wish to do with their phonebook
        boolean menu = true;
        while (menu == true)
        {
            System.out.println("Type a number to select one of the following options: ");
            System.out.println("1 - Add new entry into phone book");
            System.out.println("2 - List all entries in phone book");
            System.out.println("3 - Update an entry");
            System.out.println("4 - Remove an entry");
            System.out.println("5 - End the program");

            Scanner inputDetector = new Scanner(System.in);
            int userInput = inputDetector.nextInt();

            //will be used to create a new entry in the phone book
            if (userInput == 1)
            {
                userBook.newEntry();
            }

            //will be used to list all contacts currently in the phonebook
            else if (userInput == 2)
            {
                userBook.listBook();
            }

            //will be used to edit a contact if the user wishes to, for example if they changed addresses
            else if (userInput == 3)
            {
                userBook.updateBook();
            }

            //will be used to remove a contact from the phonebook
            else if (userInput == 4)
            {
                userBook.removeBook();
            }

            //closes the program
            else if (userInput == 5)
            {
                System.exit(0);
            }
        }
    }

}

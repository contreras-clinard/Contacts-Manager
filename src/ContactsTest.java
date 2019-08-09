import java.io.File;
import java.io.IOException;
import java.nio.file.StandardOpenOption;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.List;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.Arrays;
import java.nio.file.Files;
import java.util.ArrayList;
//import java.util.
import java.util.Collections;


public class ContactsTest extends Contact{
    public ContactsTest(String firstName, String lastName, String phoneNumber) throws IOException {
        super(firstName, lastName, phoneNumber);
    }

    public static void main(String[] args) throws IOException {

//        VARIABLES
        File file = new File("/Users/brandi/IdeaProjects/Contacts-Manager/data/contacts.txt");
        Scanner scanner = new Scanner(file);
        Scanner scan = new Scanner(System.in);
        Path contactsPath = Paths.get("data", "contacts.txt");
        int input;

//        PRINTS LIST
            List<String> list = Files.readAllLines(contactsPath);
            Collections.sort(list);
            for (int i = 0; i < list.size(); i += 1) {
                System.out.println((i + 1) + " : " + list.get(i));
            }
        System.out.println();

        //--FOR THE SWITCH CASE:
//
        String  menu="\n\nMENU";
        menu +="\n1. View contacts.\n";
        menu+="2. Add a new contact.\n";
        menu+="3. Search a contact by name.\n";
        menu+="4. Delete an existing contact.\n";
        menu+="5. Exit.\n" ;
        menu+="Enter an option:\n";

    do {
        System.out.println(menu);

         input = scan.nextInt();

        //NEED TO WRAP IN A DO WHILE;
        switch (input) {
            case 1:
                list = Files.readAllLines(contactsPath);
                Collections.sort(list);
                for (int i = 0; i < list.size(); i += 1) {
                    System.out.println((i + 1) + " : " + list.get(i));
                }
                break;
            case 2:
                addContact();
                break;
            case 3:
                searchContact();
                break;
            case 4:
                removeContact();
                break;
            case 5:
                System.out.println("Goodbye");
            default:
                break;

        }
    }while(input !=5);

    }

}

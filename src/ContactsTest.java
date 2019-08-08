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

public class ContactsTest extends Contacts{
    public ContactsTest(String firstName, String lastName, String phoneNumber) throws IOException {
        super(firstName, lastName, phoneNumber);
    }

    public static void main(String[] args) throws IOException {

//        variables
        File file = new File("/Users/Alexandra/IdeaProjects/Contacts-Manager/data/contacts.txt");
        Scanner scanner = new Scanner(file);
        Scanner scan = new Scanner(System.in);
        Path contactsPath = Paths.get("data", "contacts.txt");


        //        Prints out List
////        ArrayList<String> list = new ArrayList<String>();
//        while (scanner.hasNextLine()) {
//            list.add(scanner.nextLine());
//            System.out.println();
//        }
//        System.out.println(list);
            List<String> list = Files.readAllLines(contactsPath);
            for (int i = 0; i < list.size(); i += 1) {
                System.out.println((i + 1) + " : " + list.get(i));
            }
        System.out.println();

        //--FOR THE SWITCH CASE:


//
        String menu ="1. View contacts.\n" +
                            "2. Add a new contact.\n" +
                            "3. Search a contact by name.\n" +
                            "4. Delete an existing contact.\n" +
                            "5. Exit.\n" +
                            "        Enter an option:\n";

        System.out.println(menu);

        int input = scan.nextInt();

        //NEED TO WRAP IN A DO WHILE;
        switch(input){
            case 1:
                list = Files.readAllLines(contactsPath);
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


//        Prints the lines
//        list = Files.readAllLines(contactsPath);
//        for (int i = 0; i < list.size(); i += 1) {
//            System.out.println((i + 1) + " : " + list.get(i));
//        }
//        System.out.println();

    }

}

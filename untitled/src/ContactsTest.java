import java.io.File;
import java.io.IOException;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.List;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.Arrays;
import java.nio.file.Files;
import java.util.ArrayList;
//import java.util.

public class ContactsTest {


//    method to addContacts
//    public static void addContact





    public static void main(String[] args) throws IOException {

//        variables
        File file = new File("/Users/Alexandra/IdeaProjects/Contacts-Manager/data/contacts.txt");
        Scanner scanner = new Scanner(file);
        Path contactsPath = Paths.get("data", "contacts.txt");

        Contacts Alexandra=new Contacts("Alexandra","210-345-5555");
        Contacts Brandi=new Contacts("Brandi","210-345-6789");


//        for(Contacts contact:Contacts) {
//        contact.getName();
//        }


        Files.write(contactsPath, Arrays.asList("Candy"),
        StandardOpenOption.APPEND
        );


//        Prints out List
        ArrayList<String> list = new ArrayList<String>();
        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }
        System.out.println(list);


//        Contact Search
        String findContact = list.get(list.indexOf("Allison"));

        System.out.println(findContact);

//
////        REMOVE CONTACTS
//        List<String> contactList = contactList;
            list.remove(list.indexOf("userInput"));
            System.out.println(list);
            Files.write(contactsPath, list);





    }
}

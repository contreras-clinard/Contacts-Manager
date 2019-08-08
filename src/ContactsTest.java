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
        File file = new File("/Users/brandi/IdeaProjects/Contacts-Manager/data/contacts.txt");
        Scanner scanner = new Scanner(file);
        Scanner scan = new Scanner(System.in);
        Path contactsPath = Paths.get("data", "contacts.txt");


        //        Prints out List
        ArrayList<String> list = new ArrayList<String>();
        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
            System.out.println();
        }
        System.out.println(list);


//        System.out.println(list);

//        Contacts Alexandra=new Contacts("Alexandra","210-345-5555");
//        Contacts Brandi=new Contacts("Brandi","210-345-6789");


//        for(Contacts contact:Contacts) {
//        contact.getName();
//        }

        System.out.println("add a contact: ");
        System.out.println("First name:");
        String inputFirst = scan.nextLine();
        System.out.println("Last name:");
        String inputLast = scan.nextLine();
        System.out.println("Phone number");
        String inputNum = scan.nextLine();
        Contacts contact = new Contacts(inputFirst, inputLast, inputNum);
        contact.addContact(inputFirst, inputLast, inputNum);

        //--displays updated list;
//        ArrayList<String> list = new ArrayList<String>();
        list = new ArrayList<String>();
        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
            System.out.println();
        }
        System.out.println();


//
//
////        Contact Search
//        String findContact = list.get(list.indexOf("Allison"));
//
//        System.out.println(findContact);
//
////
//////        REMOVE CONTACTS
////        List<String> contactList = contactList;
//            list.remove(list.indexOf("userInput"));
//            System.out.println(list);
//            Files.write(contactsPath, list);
//




    }

}

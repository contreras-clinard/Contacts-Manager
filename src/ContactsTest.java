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


//    method to addContacts
//    public static void addContact






    public static void main(String[] args) throws IOException {

//        variables
        File file = new File("/Users/brandi/IdeaProjects/Contacts-Manager/data/contacts.txt");
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




//        System.out.println(list);

//        Contacts Alexandra=new Contacts("Alexandra","210-345-5555");
//        Contacts Brandi=new Contacts("Brandi","210-345-6789");


//        for(Contacts contact:Contacts) {
//        contact.getName();
//        }

        //CODE BELOW WORKS

//        System.out.println("add a contact: ");
//        System.out.println("First name:");
//        String inputFirst = scan.nextLine();
//        System.out.println("Last name:");
//        String inputLast = scan.nextLine();
//        System.out.println("Phone number");
//        String inputNum = scan.nextLine();
//        Contacts contact = new Contacts(inputFirst, inputLast, inputNum);
//        contact.addContact(inputFirst, inputLast, inputNum);



                                                                          //--displays updated list;
//        ArrayList<String> list = new ArrayList<String>();
//        list = new ArrayList<String>();
//        while (scanner.hasNextLine()) {
//            list.add(scanner.nextLine());
//            System.out.println();
//
//        }
//        System.out.println();

//        for (String line : list) {
//            System.out.println(line);
//        }






//

//        Contact Search
//        String findContact = contact.searchContact("alexandra");

//        System.out.println(findContact);
//        contact.searchContact("sifuentes");
//     contact.searchContact("contreras");

       

////
//////        REMOVE CONTACTS
//        List<String> contactList = contactList;
//            list.remove(list.indexOf("userInput"));
//            System.out.println(list);
//            Files.write(contactsPath, list);
////


        //--FOR THE SWITCH CASE:



        String menu ="1. View contacts.\n" +
                            "2. Add a new contact.\n" +
                            "3. Search a contact by name.\n" +
                            "4. Delete an existing contact.\n" +
                            "5. Exit.\n" +
                            "        Enter an option (1, 2, 3, 4 or 5):\n";

        System.out.println(menu);

        int input = scan.nextInt();

        //NEED TO WRAP IN A DO WHILE;
        switch(input){
            case 1:
//                System.out.println("Would you like to view all of the contacts?");
                list = Files.readAllLines(contactsPath);
                for (int i = 0; i < list.size(); i += 1) {
                    System.out.println((i + 1) + " : " + list.get(i));
                }


//            case 2:
//                break;
//            case 3:
//                break;
//            case 4:
//                break;
            case 5:
                System.out.println("Goodbye");
            default:
                break;

        }




    }

}

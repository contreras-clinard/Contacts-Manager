import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    static File file = new File("/Users/Alexandra/IdeaProjects/Contacts-Manager/data/contacts.txt");
    static Scanner scanner;
    static Path contactsPath = Paths.get("data", "contacts.txt");
    static Scanner scan = new Scanner(System.in);


//    constructor

    public Contact(String firstName, String lastName, String phoneNumber) throws IOException {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }


    //-- TO ADD A CONTACT;

    public static void addContact() throws IOException {
        System.out.println("Please enter the new contact information: ");
        System.out.println("First name:");
        String inputFirst = scan.nextLine();
        System.out.println("Last name:");
        String inputLast = scan.nextLine();
        System.out.println("Phone number:");
        String inputNum = scan.nextLine();

        String contactInfo = String.format("%-15s %-15s | %15s", inputFirst, inputLast, inputNum);
        System.out.println("You have added: " + contactInfo);
        Files.write(contactsPath, Arrays.asList(contactInfo),
                StandardOpenOption.APPEND
        );
    }

    //    SEARCH CONTACT
    public static void searchContact() throws IOException {
        List<String> list = Files.readAllLines(contactsPath);
//        System.out.println(list);
        System.out.println("Which contact would you like to Search for?");
        String input = scan.nextLine();
//
        for (int i = 0; i <= list.size() - 1; i++) {
            if (list.get(i).toLowerCase().contains(input.toLowerCase())) {
                System.out.println("Contact info:\n" + list.get(i));
//
            }
        }
    }

    //    REMOVE CONTACT
    public static void removeContact() throws IOException {
        List<String> removeList = Files.readAllLines(contactsPath);
        System.out.println("Which Contact would you like to Delete?");
        String input = scan.nextLine();
        for (int i = 0; i <= removeList.size() - 1; i++) {
            if (removeList.get(i).toLowerCase().contains(input.toLowerCase())) {
                String item = removeList.get(i);
//                System.out.println("this is line 89:" + item);
                removeList.remove(i);
                System.out.println("You have deleted " + item);
            }
        }
        Files.write(contactsPath, removeList);

    }

    //EDIT CONTACT: Work in progress

//    public static void editContact() throws IOException {
//        List<String> lines = Files.readAllLines(Paths.get("data", "contacts.txt"));
//        List<String> editList = new ArrayList<>();
//        System.out.println("Who would you like to edit?");
//        String input = scan.nextLine();
//
//        for (int i = 0; i <= lines.size() - 1; i++) {
//            if (lines.get(i).toLowerCase().contains(input.toLowerCase())) {
//                System.out.println("Contact info:\n" + lines.get(i));
//
//                for (i = 0; i <= lines.size() - 1; i++) {
//                    if (lines.get(i).toLowerCase().contains(input.toLowerCase())) {
//                        String item = lines.get(i);
////                System.out.println("this is line 89:" + item);
//                        lines.remove(i);
////                removeContact();
//                    }
//                }
////                System.out.println("Please enter the new contact information:");
//                addContact();
//            }
//
//            Files.write(Paths.get("data", "contacts.txt"), editList);
//        }
//    }
}


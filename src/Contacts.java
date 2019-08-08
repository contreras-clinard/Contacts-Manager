import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Contacts {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    static File file = new File("/Users/Alexandra/IdeaProjects/Contacts-Manager/data/contacts.txt");
    Scanner scanner = new Scanner(file);
    static Path contactsPath = Paths.get("data", "contacts.txt");
    static Scanner scan= new Scanner(System.in);


//    constructor

    public Contacts(String firstName, String lastName, String phoneNumber) throws IOException {
        this.firstName=firstName;
        this.lastName = lastName;
        this.phoneNumber=phoneNumber;
    }


    //-- TO ADD A CONTACT;

    public static void addContact() throws IOException {
        System.out.println("add a contact: ");
        System.out.println("First name:");
        String inputFirst = scan.nextLine();
        System.out.println("Last name:");
        String inputLast = scan.nextLine();
        System.out.println("Phone number");
        String inputNum = scan.nextLine();

        String concat=inputFirst+" "+inputLast+" "+inputNum;
        Files.write(contactsPath, Arrays.asList(concat),
                StandardOpenOption.APPEND
        );
    }

//    Search for Contact
    public static void searchContact() throws IOException {
        List<String> list= Files.readAllLines(contactsPath);

        System.out.println("Which contact would you like to Search for?");
        String input= scan.nextLine();
//
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).toLowerCase().contains(input)) {
                System.out.println(list.get(i));
//
            }
        }
    }


    public  static void removeContact() throws IOException {
        List<String> removeList= Files.readAllLines(contactsPath);
        System.out.println("Which Contact would you like to Delete?");
            String input= scan.nextLine();
        for (int i = 0; i < removeList.size() - 1; i++) {
            if (removeList.get(i).toLowerCase().contains(input)) {
                String item=removeList.get(i);
                System.out.println("this is line 89:" + item);
                removeList.remove(i);
            }
            }
        Files.write(contactsPath, removeList);

    }
}


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

public class Contacts {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    File file = new File("/Users/Alexandra/IdeaProjects/Contacts-Manager/data/contacts.txt");
    Scanner scanner = new Scanner(file);
    Path contactsPath = Paths.get("data", "contacts.txt");
    List<String> list = Files.readAllLines(contactsPath);



//    constructor

    public Contacts(String firstName, String lastName, String phoneNumber) throws IOException {
        this.firstName=firstName;
        this.lastName = lastName;
        this.phoneNumber=phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber= phoneNumber;
    }

    public void setName(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName= lastName;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public String getName(){
        return this.firstName + this.lastName;
    }



    //-- TO ADD A CONTACT;

    public void addContact(String firstName, String lastName, String phoneNumber) throws IOException {
        String concat=this.firstName+" "+this.lastName+" "+this.phoneNumber;
        Files.write(contactsPath, Arrays.asList(concat),
                StandardOpenOption.APPEND
        );
    }

//    Search for Contact
    public void searchContact(String input) {
//
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).toLowerCase().contains(input)) {
                System.out.println(list.get(i));
//
            }
        }
    }


    public void removeContact(String input) throws IOException {
        List<String> removeList= Files.readAllLines(contactsPath);

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


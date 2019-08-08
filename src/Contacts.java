import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;

public class Contacts {
    private String firstName;
    private String lastName;
    private String phoneNumber;


//    constructor

    public Contacts(String firstName, String lastName, String phoneNumber){
        this.firstName=firstName;
        this.lastName = lastName;
        this.phoneNumber=phoneNumber;
    }

    public void setPhoneNumber(String num){
        this.phoneNumber=num;
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
    Path contactsPath = Paths.get("data", "contacts.txt");

    public void addContact(String firstName, String lastName, String phoneNumber) throws IOException {
        String concat=this.firstName+" "+this.lastName+" "+this.phoneNumber;
        Files.write(contactsPath, Arrays.asList(concat),
                StandardOpenOption.APPEND
        );
    }




}


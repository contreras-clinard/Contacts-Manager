import java.util.ArrayList;

public class Contacts {
    private String name;
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
        this.lastName= lastname;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public String getName(){
        return this.firstName , this.lastName;
    }

    //-- TO ADD A CONTACT;
    public void addContact(String firstName, String lastName, String phoneNumber) {
        Files.write(contactsPath, Arrays.asList({this.firstName, this.lastName, this.phoneNumber}),
                StandardOpenOption.APPEND
        );
    }


}


import java.util.ArrayList;

public class Contacts {
    private String name;
    private String phoneNumber;


//    constructor

    public Contacts(String name, String phoneNumber){
        this.name=name;
        this.phoneNumber=phoneNumber;

    }

    public void setPhoneNumber(String num){
        this.phoneNumber=num;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public String getName(){
        return this.name;
    }

}


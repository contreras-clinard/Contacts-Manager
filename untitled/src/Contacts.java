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

public class Contacts {

//    private static List<String> contactList(){
//        return new ArrayList<>(Arrays.asList("Alicia", "Alex", "Brandi","Bob"));
//    }

    public static void main (String [] args) throws IOException {



        File file=new File("/Users/Alexandra/IdeaProjects/Contacts-Manager/data/contacts.txt");
        Scanner scanner= new Scanner(file);

        String fileContent="";

        ArrayList<String> list = new ArrayList<String>();
        while(scanner.hasNextLine()){
            list.add(scanner.nextLine());
//            System.out.println(scanner.nextLine());
        }
        scanner.close();





//        Add to List

//        List<String> contactList = new ArrayList<>(Arrays.asList("Alicia", "Alex", "Brandi","Bob"));
        System.out.println(list);

        Files.write(
         Paths.get("data", "contacts.txt"),
        Arrays.asList("Nick"),
        StandardOpenOption.APPEND


//        Files.write(filepath, list);
        );
        System.out.println(list);




//        Contact Search
//        String findContact=contactList.get(contactList.indexOf("Brandi"));

//        System.out.println(findContact);

//
////        REMOVE CONTACTS
////        List<String> contactList = contactList;
//        list.remove(list.indexOf("Alicia"));
//        System.out.println(list);
//        Files.write(filepath, list);
    }
}

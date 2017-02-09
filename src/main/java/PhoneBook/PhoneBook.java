package PhoneBook;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by alfatihmukhtar on 2/8/17.
 */
public class PhoneBook {
    private Map<String, Contact> book = new HashMap<String, Contact>();

    public PhoneBook() {
        Contact person = new Contact();
        book.put("John Doe",person);
    }
    public Map<String,String> lookUp(String name) {
        return book.get(name).phoneNumbers;
    }
    public String reverseLookUp(String phoneNumber) {

    }
}

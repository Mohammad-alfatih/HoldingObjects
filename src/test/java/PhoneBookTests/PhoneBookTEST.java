package PhoneBookTests;

import PhoneBook.PhoneBook;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by alfatihmukhtar on 2/9/17.
 */
public class PhoneBookTEST {
    PhoneBook phoneBook;
    Map<String,String> testMap;

    @Before
    public void setUp() {
        phoneBook = new PhoneBook();
        testMap = new HashMap<String, String>();

        testMap.put("Home","215-555-9999");
    }

    @Test
    public void lookUpTest() {
        Map<String,String> expected = testMap;
        Map<String,String> actual = phoneBook.lookUp("John Doe");
        assertEquals("Not the correct value",expected,actual);
    }
}

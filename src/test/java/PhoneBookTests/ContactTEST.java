package PhoneBookTests;

import PhoneBook.Contact;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by alfatihmukhtar on 2/9/17.
 */
public class ContactTEST {
    Contact contact;
    List<String> testEmail;
    List<String> testHomeAddress;
    List<String> testBizAddress;

    @Before
    public void setUp() {
        contact = new Contact("Ahmad","Bradshaw",
                "215-987-3456","ahmadIsTheMan@dude.com",
                "1100 Walnut St.","Philadelphia","PA 19102");
        contact.setBusinessAddresses("1305 Market St.","Philadelphia","PA 19103");
        testEmail = new ArrayList<String>();
        testHomeAddress = new ArrayList<String>();
        testBizAddress = new ArrayList<String>();

        testEmail.add("ahmadIsTheMan@dude.com");

        testHomeAddress.add("1100 Walnut St.");
        testHomeAddress.add("Philadelphia");
        testHomeAddress.add("PA 19102");

        testBizAddress.add("1305 Market St.");
        testBizAddress.add("Philadelphia");
        testBizAddress.add("PA 19103");
    }

    @Test
    public void getFirstNameAndGetLastNameTest() {
        String expected = "Ahmad, Bradshaw";
        String actual = contact.getFirstName() + ", " + contact.getLastName();
        assertEquals("You did not get the proper result",expected,actual);
    }

    @Test
    public void getPhoneNumbersTest() {
        Map<String,String> testMap = new HashMap<String,String>();
        testMap.put("Home","215-987-3456");
        Map<String,String> expected = testMap;
        Map<String,String> actual = contact.getPhoneNumbers();
        assertEquals("This is not the correct phone number and label",expected,actual);
    }

    @Test
    public void getEmailAddressTest() {
        List<String> expected = testEmail;
        List<String> actual = contact.getEmailAddresses();
        assertEquals("Wrong email address",expected,actual);
    }

    @Test
    public void getHomeAddressTest() {
        List<String> expected = testHomeAddress;
        List<String> actual = contact.getHomeAddress();
        assertEquals("Wrong address, this zipcode is not correct",expected,actual);
    }

    @Test
    public void getBusinessAddressTest() {
        List<String> expected = testBizAddress;
        List<String> actual = contact.getBusinessAddresses();
        assertEquals("Wrong address, this zipcode is not correct",expected,actual);
    }






//    public String getFirstName() { return firstName; }
//    public String getLastName() { return lastName; }
//    public Map<String, String> getPhoneNumbers() { return phoneNumbers; }
//    public List<String> getEmailAddresses() { return emailAddresses;  }
//    public List<String> getHomeAddress() { return homeAddress; }
//    public List<String> getBusinessAddresses() { return businessAddress; }
}

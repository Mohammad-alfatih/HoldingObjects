package PhoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by alfatihmukhtar on 2/8/17.
 */
public class Contact {
    // FIELDS
    String firstName;
    String lastName;
    Map<String,String> phoneNumbers = new HashMap<String,String>();
    ArrayList<String> emailAddresses = new ArrayList<String>();
    List<String> homeAddress = new ArrayList<String>();
    List<String> businessAddress = new ArrayList<String>();

    // CONSTRUCTORS
    public Contact() {
        firstName = "Fulaan";
        lastName = "Illaan";
        phoneNumbers.put("Home", "215-555-9999");
    }
    public Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        phoneNumbers.put("Home", phoneNumber);
    }
    public Contact(String firstName, String lastName, String phoneNumber,
                   String emailAddress, String homeAddress1, String homeAddress2, String homeAddress3) {
        this.firstName = firstName;
        this.lastName = lastName;
        phoneNumbers.put("Home", phoneNumber);
        emailAddresses.add(emailAddress);
        homeAddress.add(homeAddress1);
        homeAddress.add(homeAddress2);
        homeAddress.add(homeAddress3);
    }

    // SETTERS
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setPhoneNumbers(String label, String number) {
        phoneNumbers.put(label, number);
    }
    public void setEmailAddresses(String emailAddress) {
        emailAddresses.add(emailAddress);
    }
    public void setHomeAddress(String homeAddress1, String homeAddress2, String homeAddress3) {
        homeAddress.add(homeAddress1);
        homeAddress.add(homeAddress2);
        homeAddress.add(homeAddress3);
    }
    public void setBusinessAddresses(String bizAddress1, String bizAddress2, String bizAddress3) {
        businessAddress.add(bizAddress1);
        businessAddress.add(bizAddress2);
        businessAddress.add(bizAddress3);
    }

    // GETTERS
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public Map<String, String> getPhoneNumbers() { return phoneNumbers; }
    public List<String> getEmailAddresses() { return emailAddresses;  }
    public List<String> getHomeAddress() { return homeAddress; }
    public List<String> getBusinessAddresses() { return businessAddress; }
}
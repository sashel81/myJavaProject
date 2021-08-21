package school.lesson8;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.*;


public class PhoneBook {
    private String name;
    private String phoneNumber;
    private HashMap<String, String> book = new HashMap<>();

    public PhoneBook() {
    }


    public void add(String name, String phoneNumber) {

        book.put(phoneNumber, name);
    }

    public String get(String name) {

        String phone = null;

        for (Map.Entry entry : book.entrySet()) {
            if (entry.getValue().equals(name)) {
                phone = (String) entry.getKey();
                System.out.println(entry.getValue() + " : " + entry.getKey());
            }
        }
        return phone;
    }
}

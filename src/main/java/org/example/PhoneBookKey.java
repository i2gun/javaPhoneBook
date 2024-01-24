package org.example;

public class PhoneBookKey {

    String name;
    Long count;

    PhoneBookKey(String contactName, Long phoneNumbersCount) {
        this.name = contactName;
        this.count = phoneNumbersCount;
    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((PhoneBookKey)obj).name);
    }
}

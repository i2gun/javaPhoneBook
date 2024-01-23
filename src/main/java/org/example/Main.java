package org.example;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addNewRecord("Ivan", 87775552211L);
        phoneBook.addNewRecord("Ivan2", 87775552212L);
        phoneBook.addNewRecord("Ivan3", 87775552213L);
        phoneBook.addNewRecord("Ivan4", 87775552214L);
        phoneBook.addNewRecord("Ivan", 87775552215L);
        phoneBook.addNewRecord("Ivan", 87775552216L);
        phoneBook.addNewRecord("Ivan3", 87775552217L);
        phoneBook.addNewRecord("Ivan2", 87775552217L);

        phoneBook.printPhoneBook();
    }
}
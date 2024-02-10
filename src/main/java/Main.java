import org.example.PhoneBook;

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
        phoneBook.addNewRecord("Ivan2", 87775551117L);
        phoneBook.addNewRecord("Ivan1", 87775550000L);
        phoneBook.addNewRecord("Ivan7", 87775558888L);
        System.out.println();
        phoneBook.printPhoneBook();
        System.out.println();

        phoneBook.removeRecord("Ivan4");
        System.out.println("Removing - Ivan4");
        phoneBook.printPhoneBook();
        System.out.println();

        System.out.println("Removing - 87775552212L from Ivan2");
        phoneBook.removeNumber(87775552212L);
        phoneBook.printPhoneBook();
        System.out.println();

        System.out.println("Removing - 87775551117L from Ivan2");
        phoneBook.removeNumber(87775551117L);
        phoneBook.printPhoneBook();
    }
}
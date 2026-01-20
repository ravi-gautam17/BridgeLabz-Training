package day11.addressbooksystem;


public class AddressBookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AddressBook myBook = new AddressBook();

        // Create addresses
        Address addr1 = new Address("New York", "NY", "10001");
        Address addr2 = new Address("Los Angeles", "CA", "90001");
        Address addr3 = new Address("Chicago", "IL", "60007");

        Contact c1 = new Contact("John", "Doe", "1234567890", "john@example.com", addr1);
        Contact c2 = new Contact("Jane", "Smith", "2345678901", "jane@example.com", addr2);
        Contact c3 = new Contact("Alice", "Johnson", "3456789012", "alice@example.com", addr3);

        myBook.addContact(c1);
        myBook.addContact(c2);
        myBook.addContact(c3);
        myBook.addContact(c1); 

        myBook.displayAllContacts();

        Contact updated = new Contact("John", "Doe", "9999999999", "john.doe@newmail.com", addr1);
        myBook.editContact("John", "Doe", updated);

        myBook.searchByCityOrState("Los Angeles");

        myBook.deleteContact("Alice", "Johnson");

        myBook.displayAllContacts();
	}

}
package day11.addressbooksystem;

import java.util.*;

public class AddressBook {

	private ArrayList<Contact> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    // Add new contact (avoid duplicates by full name)
    public boolean addContact(Contact c) {
        for (Contact existing : contacts) {
            if (existing.getFirstName().equalsIgnoreCase(c.getFirstName())
                    && existing.getLastName().equalsIgnoreCase(c.getLastName())) {
                System.out.println("Duplicate contact. Cannot add.");
                return false;
            }
        }
        contacts.add(c);
        System.out.println("Contact added: " + c.getFirstName() + " " + c.getLastName());
        return true;
    }

    // Edit existing contact by name
    public boolean editContact(String firstName, String lastName, Contact updated) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact c = contacts.get(i);
            if (c.getFirstName().equalsIgnoreCase(firstName) && c.getLastName().equalsIgnoreCase(lastName)) {
                contacts.set(i, updated);
                System.out.println("Contact updated: " + firstName + " " + lastName);
                return true;
            }
        }
        System.out.println("Contact not found.");
        return false;
    }

    // Delete contact by name
    public boolean deleteContact(String firstName, String lastName) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(firstName) && c.getLastName().equalsIgnoreCase(lastName)) {
                contacts.remove(c);
                System.out.println("Deleted contact: " + firstName + " " + lastName);
                return true;
            }
        }
        System.out.println("Contact not found.");
        return false;
    }

    // Search contacts by city or state
    public void searchByCityOrState(String keyword) {
        System.out.println("Search results for: " + keyword);
        for (Contact c : contacts) {
            Address addr = c.getAddress();
            if (addr != null && (addr.getCity().equalsIgnoreCase(keyword) || addr.getState().equalsIgnoreCase(keyword))) {
                System.out.println(c);
            }
        }
    }

    // Display all contacts sorted alphabetically by first name, then last name
    public void displayAllContacts() {
        Collections.sort(contacts, Comparator.comparing(Contact::getFirstName).thenComparing(Contact::getLastName));
        System.out.println("All contacts:");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
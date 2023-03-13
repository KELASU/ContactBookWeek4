import java.util.LinkedList;
import java.util.Scanner;

public class ContactBook {
    private static LinkedList<Contact> contacts = new LinkedList<>();
    private static class Contact {
        private String name;
        private String phoneNumber;
        private String email;

        public Contact(String name, String phoneNumber, String email) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getEmail() {
            return email;
        }
    }
    public static void addContact() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter Contact Name:");
        String name = scanner.nextLine().toLowerCase();
        System.out.println("Please Enter The Phone Number:");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please Enter E-mail Address:");
        String email = scanner.nextLine().toLowerCase();

        Contact contact = new Contact(name, phoneNumber, email);
        contacts.add(contact);
        System.out.println("ADDED SUCCESS!!!");
    }

    public static void deleteContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Contact Name:");
        String name = scanner.nextLine().toLowerCase();
        boolean contactDeleted = false;

        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contacts.remove(contact);
                contactDeleted = true;
                System.out.println("DELETE SUCCESS!!!");
                break;
            }
        }
        if (!contactDeleted) {
            System.out.println("NOT FOUND!!!");
        }
    }

    public static void searchContact() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter Contact Name:");
        String name = scanner.nextLine().toLowerCase();

        boolean contactFound = false;

        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Contact Name: " + contact.getName());
                System.out.println("Phone Number: " + contact.getPhoneNumber());
                System.out.println("Email Address: " + contact.getEmail());
                contactFound = true;
                break;
            }
        }

        if (!contactFound) {
            System.out.println("NOT FOUND!!!");
        }
    }

    public static void searchEmail() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Contact Email Address:");
        String email = scanner.nextLine().toLowerCase();

        boolean emailFound = false;

        for (Contact contact : contacts) {
            if (contact.getEmail().equalsIgnoreCase(email)) {
                System.out.println("Contact Name: " + contact.getName());
                System.out.println("Phone Number: " + contact.getPhoneNumber());
                System.out.println("Email Address: " + contact.getEmail());
                emailFound = true;
                break;
            }
        }

        if (!emailFound) {
            System.out.println("NOT FOUND!!!");
        }
    }

    public static void printContactList() {
        if (contacts.isEmpty()) {
            System.out.println("NOT FOUND!!!");
        } else {
            System.out.println("Contact List:");
            for (Contact contact : contacts) {
                System.out.println("Contact Name: " + contact.getName());
                System.out.println("Phone Number: " + contact.getPhoneNumber());
                System.out.println("Email Address: " + contact.getEmail());
            }
        }
    }
}

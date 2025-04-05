package com.olixstudios.contactbook.app;

import java.util.List;
import java.util.Scanner;

import com.olixstudios.contactbook.model.Contact;
import com.olixstudios.contactbook.service.ContactService;
import com.olixstudios.contactbook.service.ContactServiceImpl;

public class ContactBookCli {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        ContactService service = new ContactServiceImpl();

        while (true) {
            System.out.println("\n--- Contact Book ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Get Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. View All Contacts");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = scanner.nextLine();
                    service.addContact(name, phone);
                    System.out.println("Contact added!");
                }
                case 2 -> {
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    Contact contact = service.getContact(name);
                    if (contact != null) System.out.println(contact);
                    else System.out.println("Not found!");
                }
                case 3 -> {
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    boolean deleted = service.deleteContact(name);
                    System.out.println(deleted ? "Deleted." : "Contact not found.");
                }
                case 4 -> {
                    List<Contact> contacts = service.getAllContacts();
                    if (contacts.isEmpty()) System.out.println("No contacts.");
                    else contacts.forEach(System.out::println);
                }
                case 5 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
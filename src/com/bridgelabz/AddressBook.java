package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    ArrayList<Contact> addressBook1 = new ArrayList<>();
    public Contact createContact() {

        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> addressBook1 = new ArrayList<>();

        Contact person = new Contact();
        System.out.print("Enter First Name: ");
        person.setFirstName(sc.next());
        System.out.print("Enter Last Name: ");
        person.setLastName(sc.next());
        System.out.print("Enter Address: ");
        person.setAddress(sc.next());
        System.out.print("Enter City: ");
        person.setCity(sc.next());
        System.out.print("Enter State: ");
        person.setState(sc.next());
        System.out.print("Enter email: ");
        person.setEmail(sc.next());
        System.out.print("Enter ZipCode: ");
        person.setZipCode(sc.nextInt());
        System.out.print("Enter Phone Number: ");
        person.setPhoneNumber(String.valueOf(sc.nextLong()));
        System.out.println("created new contact");
        return person;
    }

    public void addContact() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> addressBook1 = new ArrayList<>();

        Contact contact = createContact();
        addressBook1.add(contact);
        System.out.println(contact);
        System.out.println("Contact added successfully");
    }


    public void editContact() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> addressBook1 = new ArrayList<>();

        boolean isContactFound = false;
        System.out.println("Enter Name to edit Contact");
        String name = sc.next();
        for (Contact contact : addressBook1) {
            if (name.equalsIgnoreCase(contact.getFirstName())) {
                isContactFound = true;
                System.out.print("Enter First Name :");
                contact.setFirstName(sc.next());
                System.out.print("Enter Last Name :");
                contact.setLastName(sc.next());
                System.out.print("Enter Address :");
                contact.setAddress(sc.next());
                System.out.print("Enter City :");
                contact.setCity(sc.next());
                System.out.print("Enter State :");
                contact.setState(sc.next());
                System.out.print("Enter email :");
                contact.setEmail(sc.next());
                System.out.print("Enter ZipCode :");
                contact.setZipCode(sc.nextInt());
                System.out.print("Enter Phone Number :");
                contact.setPhoneNumber(String.valueOf(sc.nextLong()));
                System.out.println(contact);
                break;
            }
        }
        if (isContactFound) {
            System.out.println("Contact Updated Successfully..");
        } else {
            System.out.println("Oops...Contact not found");
        }
    }
    public void deleteContact() {
        boolean isContactFound = false;
        System.out.println("enter name to delete contact");
        String name = sc.next();
        for (Contact contactPerson : addressBook1) {
            if (contactPerson.getFirstName().equalsIgnoreCase(name)) {
                System.out.println("contact found:");
                isContactFound = true;
                System.out.println(contactPerson);
                System.out.println("confirm to delete (y/n)");
                if (sc.next().equalsIgnoreCase("y")) {
                    addressBook1.remove(contactPerson);
                    System.out.println("contact deleted");
                }
                break;
            }
        }
        if (!isContactFound) {
            System.out.println("Opps... contact not found");
        }
    }

    void display() {
        ArrayList<Contact> addressBook1 = new ArrayList<>();

        for (Contact person : addressBook1) {
            System.out.println(person);
        }
    }
}

package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {

            System.out.println("Welcome to Address Book program");
            Scanner sc = new Scanner(System.in);
            AddressBook addressBook1 = new AddressBook("Family");
            AddressBook addressBook2 = new AddressBook("Friends");
            AddressBook addressBook3 = new AddressBook("Office");

            addressBook1.addContact();
            addressBook2.addContact();
            addressBook3.addContact();


            boolean flag1 = true;
            while (flag1) {
                System.out.println("*******************\nSelect Option : ");
                System.out.println("1.Add Contact\n2.Edit Contact\n3.Delete Contact\n4.Display\n5.Exit");
                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        addressBook1.getName();
                        addressBook1.addContact();
                        addressBook2.getName();
                        addressBook2.addContact();
                        addressBook2.getName();
                        addressBook3.addContact();
                        break;
                    case 2:
                        addressBook1.editContact();
                        addressBook2.editContact();
                        addressBook3.editContact();

                        break;
                    case 3:
                        addressBook1.deleteContact();
                        addressBook2.deleteContact();
                        addressBook3.deleteContact();
                        break;
                    case 4:
                        Map<String, AddressBook> addressBookMap = new HashMap<>();
                        addressBookMap.put(addressBook1.getName(), addressBook1);
                        addressBookMap.put(addressBook2.getName(), addressBook2);
                        addressBookMap.put(addressBook3.getName(), addressBook3);


                        for (Map.Entry addressBookName : addressBookMap.entrySet()) {
                            System.out.println(addressBookName.getKey() + " " + addressBookName.getValue());
                        }
                        break;
                    case 5:
                        flag1 = false;
                        break;
                    default:
                        System.out.println(option + " is not valid option");
                        break;
                }
            }
        }
}

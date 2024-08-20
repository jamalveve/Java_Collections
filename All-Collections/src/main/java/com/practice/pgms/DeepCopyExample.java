package com.practice.pgms;

public class DeepCopyExample {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Springfield");
        PersonWithAddress originalPerson = new PersonWithAddress("Alice", address);

        // Clone the PersonWithAddress object
        PersonWithAddress clonedPerson = (PersonWithAddress) originalPerson.clone();

        // Print the original and cloned objects
        System.out.println("Original Person: " + originalPerson);
        System.out.println("Cloned Person: " + clonedPerson);

        // Modify the cloned object
        originalPerson.address=new Address("564 ekn ","street,tekasi");
        clonedPerson.address = new Address("456 Elm St", "Shelbyville");

        // Print the original and cloned objects after modification
        System.out.println("Original Person after modification: " + originalPerson);
        System.out.println("Cloned Person after modification: " + clonedPerson);
    }
}
class Address implements Cloneable {
    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return street + ", " + city;
    }
}

class PersonWithAddress implements Cloneable {
    private String name;
    public Address address;

    public PersonWithAddress(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() {
        try {
            PersonWithAddress cloned = (PersonWithAddress) super.clone();
            cloned.address = (Address) address.clone(); // Deep clone of the Address
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', address=" + address + "}";
    }
}



package co.edu.cesde.ga.app;

import co.edu.cesde.ga.model.Person;

public class Main {

    public static void main(String[] args) {

        // Instanciación con constructor vacío
        Person person1 = new Person();

        person1.setUserId(1L);
        person1.setCode("A1B2C3");
        person1.setDocumentNumber("1234567890");
        person1.setFirstName("David");
        person1.setLastName("Moreno");
        person1.setStatus("ACTIVE");

        System.out.println("User ID: " + person1.getUserId());
        System.out.println("Code: " + person1.getCode());
        System.out.println("Document Number: " + person1.getDocumentNumber());
        System.out.println("First Name: " + person1.getFirstName());
        System.out.println("Last Name: " + person1.getLastName());
        System.out.println("Status: " + person1.getStatus());

        // Instanciación con constructor lleno
        Person person2 = new Person(2L, "D4E5F6", "2345678901", "Carlos", "Vélez", "INACTIVE");

        System.out.println("User ID: " + person2.getUserId());
        System.out.println("Code: " + person2.getCode());
        System.out.println("Document Number: " + person2.getDocumentNumber());
        System.out.println("First Name: " + person2.getFirstName());
        System.out.println("Last Name: " + person2.getLastName());
        System.out.println("Status: " + person2.getStatus());

    }

}

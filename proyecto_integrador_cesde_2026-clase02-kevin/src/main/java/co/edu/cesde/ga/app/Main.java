package co.edu.cesde.ga.app;

import co.edu.cesde.ga.model.*;

import javax.swing.*;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Instanciación de person1 con constructor vacío
        Person person1 = new Person();

        person1.setUserId(1L);
        person1.setCode("A1B2C3");
        person1.setDocumentNumber("1234567890");
        person1.setFirstName("David");
        person1.setLastName("Moreno");
        person1.setStatus("ACTIVE");

        System.out.println("PERSON 1");
        System.out.println("User ID: " + person1.getUserId());
        System.out.println("Code: " + person1.getCode());
        System.out.println("Document Number: " + person1.getDocumentNumber());
        System.out.println("First Name: " + person1.getFirstName());
        System.out.println("Last Name: " + person1.getLastName());
        System.out.println("Status: " + person1.getStatus());
        System.out.println("------------------------- ");

        // Instanciación de person2 con constructor lleno
        Person person2 = new Person(2L, "D4E5F6", "2345678901", "Carlos", "Vélez", "INACTIVE");

        System.out.println("PERSON 2");
        System.out.println("User ID: " + person2.getUserId());
        System.out.println("Code: " + person2.getCode());
        System.out.println("Document Number: " + person2.getDocumentNumber());
        System.out.println("First Name: " + person2.getFirstName());
        System.out.println("Last Name: " + person2.getLastName());
        System.out.println("Status: " + person2.getStatus());
        System.out.println("------------------------- ");

        // Instanciación de teacher1 con constructor vacío
        Teacher teacher1 = new Teacher();

        teacher1.setUserId(3L);
        teacher1.setCode("G7H8I9");
        teacher1.setDocumentNumber("3456789012");
        teacher1.setFirstName("Gonzalo");
        teacher1.setLastName("Pérez");
        teacher1.setStatus("ACTIVE");

        System.out.println("TEACHER 1");
        System.out.println("User ID: " + teacher1.getUserId());
        System.out.println("Code: " + teacher1.getCode());
        System.out.println("Document Number: " + teacher1.getDocumentNumber());
        System.out.println("First Name: " + teacher1.getFirstName());
        System.out.println("Last Name: " + teacher1.getLastName());
        System.out.println("Status: " + teacher1.getStatus());
        System.out.println("------------------------- ");

        // Instanciación de teacher2 con constructor lleno
        Teacher teacher2 = new Teacher(4L, "J0K1L2", "4567890123", "Felipe", "Arbeláez", "INACTIVE");

        System.out.println("TEACHER 2");
        System.out.println("User ID: " + teacher2.getUserId());
        System.out.println("Code: " + teacher2.getCode());
        System.out.println("Document Number: " + teacher2.getDocumentNumber());
        System.out.println("First Name: " + teacher2.getFirstName());
        System.out.println("Last Name: " + teacher2.getLastName());
        System.out.println("Status: " + teacher2.getStatus());
        System.out.println("------------------------- ");

        // Instanciación de student1 con constructor vacío
        Student student1 = new Student();

        student1.setUserId(5L);
        student1.setCode("M3N4O5");
        student1.setDocumentNumber("5678901234");
        student1.setFirstName("Luis");
        student1.setLastName("López");
        student1.setStatus("ACTIVE");
        student1.setBirthDate(LocalDate.of(2000,1,1));

        System.out.println("STUDENT 1");
        System.out.println("User ID: " + student1.getUserId());
        System.out.println("Code: " + student1.getCode());
        System.out.println("Document Number: " + student1.getDocumentNumber());
        System.out.println("First Name: " + student1.getFirstName());
        System.out.println("Last Name: " + student1.getLastName());
        System.out.println("Status: " + student1.getStatus());
        System.out.println("Birth Date: " + student1.getBirthDate());
        System.out.println("------------------------- ");

        // Instanciación de student2 con constructor lleno
        Student student2 = new Student(6L, "P6Q7R8", "6789012345", "Mateo", "Ramos", "INACTIVE", LocalDate.of(2000,2,2));

        System.out.println("STUDENT 2");
        System.out.println("User ID: " + student2.getUserId());
        System.out.println("Code: " + student2.getCode());
        System.out.println("Document Number: " + student2.getDocumentNumber());
        System.out.println("First Name: " + student2.getFirstName());
        System.out.println("Last Name: " + student2.getLastName());
        System.out.println("Status: " + student2.getStatus());
        System.out.println("Birth Date: " + student2.getBirthDate());
        System.out.println("------------------------- ");

        // Instanciación de program1 con constructor vacío
        Program program1 = new Program();

        program1.setProgramId(5432L);
        program1.setCode("LI4478");
        program1.setName("Calculation");

        System.out.println("PROGRAM 1");
        System.out.println("Program ID: " + program1.getProgramId());
        System.out.println("Code: " + program1.getCode());
        System.out.println("Name: " + program1.getName());
        System.out.println("------------------------- ");

        // Instanciación de program2 con constructor lleno
        Program program2 = new Program(8901L, "CR5500", "English");

        System.out.println("PROGRAM 2");
        System.out.println("Program ID: " + program2.getProgramId());
        System.out.println("Code: " + program2.getCode());
        System.out.println("Name: " + program2.getName());
        System.out.println("------------------------- ");

        //Instancia de group con constructor vacio
        Group group1 = new Group();

        group1.setGroupId(3467L);
        group1.setCode("G7H8I9");
        group1.setProgramId("5432L");
        group1.setPeriodId("105690");
        group1.setShift("mañana");

        System.out.println("GROUP 1");
        System.out.println("Group ID: " + group1.getGroupId());
        System.out.println("Code: " + group1.getCode());
        System.out.println("program Id: " + group1.getProgramId());
        System.out.println("period Id: " + group1.getPeriodId());
        System.out.println("shift Id: " + group1.getShift());
        System.out.println("------------------------- ");

        // Instancia de Group usando el constructor lleno
        Group group2 = new Group();

        System.out.println("GROUP 2");
        System.out.println("group ID: " + group2.getGroupId());
        System.out.println("Code: " + group2.getCode());
        System.out.println("Program ID: " + group2.getProgramId());
        System.out.println("Period ID: " + group2.getPeriodId());
        System.out.println("Shift: " + group2.getShift());
        System.out.println("------------------------- ");

            }
        }
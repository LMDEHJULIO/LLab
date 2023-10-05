package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person newPerson = new Person(12345654l, "Julio");

    @org.junit.jupiter.api.Test
    void getId() {
    }

    @org.junit.jupiter.api.Test
    void getName() {
    }

    @org.junit.jupiter.api.Test
    void setName() {
    }

    @Test
    void testConstructor(){


        assertTrue(newPerson.getId() == 12345654);
    }

    @Test
    void testSetName(){
        newPerson.setName("Jon");

        assertEquals("Jon", newPerson.getName());
    }
}
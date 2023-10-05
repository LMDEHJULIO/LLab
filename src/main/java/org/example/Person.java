package org.example;

public class Person {

    private final long id;
    private String name;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Person(long id, String name){
        this.id = id;


    }
}

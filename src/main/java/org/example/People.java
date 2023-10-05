package org.example;

import java.lang.reflect.Array;
import java.util.List;

public class People {
    List<Person> personList;

    public boolean add(Person person){
        try {
            personList.add(person);
            return true;
        } catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

//    public Person findById(long id){};
//
//    public boolean contains(){};
//
//    public boolean remove(){};
//
//    public boolean removeAll(){};
//
//    public int count(){};
//
//    public Array toArray(){}
//
//    public Iterable<Person> iterator(){}


}

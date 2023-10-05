package org.example;

import java.util.List;

public class Students extends People {

    private final static Students INSTANCE =  (Students) List.of(new Student(2131231l, "Dante"), new Student(21355631l, "Blanca"), new Student(39504943l, "Jordy Shmordy"));

    private Students(){
        final Students instance = INSTANCE;
    }

    public static synchronized Students getStudentInstance(){
        return INSTANCE;
    }


}

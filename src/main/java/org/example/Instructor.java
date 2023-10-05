package org.example;

public class Instructor extends Person implements Teacher {

    private double numberOfHoursPerLearner;

    Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {

    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {

    }
}

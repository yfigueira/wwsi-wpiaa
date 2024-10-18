package org.example.codesmells.refusedbequest;

public class Employee implements IEmployee {

    private String name;
    private String position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void work() {
        // some work
    }

    public void attendMeeting() {
        // going to meeting
    }
}

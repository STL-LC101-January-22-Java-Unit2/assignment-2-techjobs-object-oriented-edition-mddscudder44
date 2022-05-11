package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a
    //  second to initialize the other five fields. The second constructor
    //  should also call the first in order to initialize the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name,Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }



    // TODO: Add custom equals and hashCode methods. Consider two Job
    //  objects "equal" when their id fields match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        //make each line start with "\n"
        return
                "\nID: " + id +
                "\nName: " + whenFieldIsEmpty(name, "Data not available") +
                "\nEmployer: " + whenFieldIsEmpty(employer.getValue(), "Data not available") +
                "\nLocation: " + whenFieldIsEmpty(location.getValue(), "Data not available") +
                "\nPosition Type: " + whenFieldIsEmpty(positionType.getValue(), "Data not available") +
                "\nCore Competency: " + whenFieldIsEmpty(coreCompetency.getValue(), "Data not available") +
                "\n" ;

    }

    public String whenFieldIsEmpty(String value, String whenFieldIsEmpty) {
        if(value.length() == 0) {
            return whenFieldIsEmpty;
        } else {
            return value;
        }
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for
    //  each field EXCEPT nextID and id.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}

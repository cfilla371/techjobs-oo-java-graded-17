package org.launchcode.techjobs.oo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;


    public Job() {
        this.id = nextId;
        nextId++;
    }
    //Getters and setters
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

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
// TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    private static String checkForBlank(String value){
        if (value == "" || value == null){
            return "Data not available";
        }
        else return value;
    }

    public  String toString(){

      int id = this.getId();
        String name = checkForBlank(this.getName());
        String employer = checkForBlank(this.getEmployer().getValue());
        String location = checkForBlank(this.getLocation().getValue());
        String positionType = checkForBlank(this.getPositionType().getValue());
        String coreCompetency = checkForBlank(this.getCoreCompetency().getValue());

        String printJob = String.format(System.lineSeparator() +
                "ID: %d" + System.lineSeparator() +
                "Name: %s" + System.lineSeparator() +
                "Employer: %s" + System.lineSeparator() +
                "Location: %s" + System.lineSeparator() +
                "Position Type: %s" + System.lineSeparator() +
                "Core Competency: %s" + System.lineSeparator(),
                id, name, employer, location, positionType, coreCompetency
        );

        return printJob;

    }
}
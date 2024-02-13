package org.launchcode.techjobs.oo;

import java.util.Objects;

// This is the Job class that represents a job listing with various attributes.
public class Job {

    // Instance variables
    private final int id; // An ID unique to each job instance
    private static int nextId = 1; // A static variable to generate unique IDs

    private String name; // The name of the job
    private Employer employer; // The employer of the job
    private Location location; // The location of the job
    private PositionType positionType; // The type of position (e.g., Full-Time, Part-Time)
    private CoreCompetency coreCompetency; // The core competency required for the job

    // Constructor to initialize a Job object with a unique ID
    public Job() {
        id = nextId;
        nextId++; // Increment the nextId for the next job created
    }

    // Constructor to initialize a Job object with all attributes
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this(); // Calls the default constructor to set a unique ID for the job
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // Helper method for formatting field values
    private String formatField(Object field) {
        if (field == null) {
            return "Data not available";
        } else if (field instanceof JobField) {
            String value = ((JobField) field).getValue();
            return value.isEmpty() ? "Data not available" : value;
        } else {
            return field.toString();
        }
    }
    // Overrides the toString method to provide a formatted string representation of the Job object
    @Override
    public String toString(){
        if (name == null || name.isEmpty()){
            return "OOPS! This job does not seem to exist.";
        }
        return "\n" +
                "ID: " + id +
                "\nName: " + formatField(name) +
                "\nEmployer: " + formatField(employer) +
                "\nLocation: " + formatField(location) +
                "\nPosition Type: " + formatField(positionType) +
                "\nCore Competency: " + formatField(coreCompetency) +
                "\n";
    }

    // Overrides the equals method to compare Job objects based on their IDs
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    // Overrides the hashCode method to generate a hash code based on the ID
    @Override
    public int hashCode() {
        return Objects.hash(id); // Generates a hash code based on the ID of the Job object.
    }

    // Getter methods for retrieving the attributes of a Job
    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    // Getter method for retrieving the ID of a Job
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}

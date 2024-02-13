package org.launchcode.techjobs.oo;

import java.util.Objects;

// This is an abstract class called JobField, which is the base class for fields used in job listings.
public abstract class JobField {
    private final int id; // An ID unique to each JobField instance
    private static int nextId = 1; // A static variable to generate unique IDs for JobField instances
    private String value; // The value of the JobField

    // Default constructor for JobField, initializes ID and increments nextId
    public JobField() {
        this.id = nextId; // Assigns a unique ID to the JobField
        nextId++; // Increments the nextId for the next JobField created
    }

    // Constructor for JobField that takes a value as a parameter
    public JobField(String value) {
        this(); // Calls the default constructor to set a unique ID for the JobField
        this.value = value; // Sets the value of the JobField
    }

    // Overrides the toString method to return the value of the JobField
    @Override
    public String toString() {
        return value; // Returns the value of the JobField as a string
    }

    public void setValue(String value) {
        this.value = value;
    }

    // Generates a hash code based on the ID of the PositionType object.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Getter method to retrieve the value of the JobField
    public String getValue() {
        return value; // Returns the value of the JobField
    }

    // Hashcode & equals methods to check when the ID fields are the same (add getter and setter) extend to each class 
    // Getter method to retrieve the ID of the JobField
    public int getId() {
        return id; // Returns the ID of the JobField
    }
}
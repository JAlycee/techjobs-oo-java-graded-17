package org.launchcode.techjobs.oo;

import java.util.Objects;

// This is the PositionType class that represents the position type attribute in a job listing.
public class PositionType extends JobField {

    // Constructor for PositionType that takes a value (position type) as a parameter and passes it to the superclass constructor.
    public PositionType(String value) {
        super(value);
    }

    @Override
    protected void getValue(String value) {

    }

    // Overrides the equals method to compare PositionType objects based on their IDs.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Checks if the objects being compared are the same instance.
        if (o == null || getClass() != o.getClass()) return false; // Checks if the classes of the objects being compared are the same.
        PositionType that = (PositionType) o; // Casts the object 'o' to a PositionType object.
        return getId() == that.getId(); // Compares the IDs of the two PositionType objects.
    }

    // Overrides the hashCode method to generate a hash code based on the ID.
    @Override
    public int hashCode() {
        return Objects.hash(getId()); // Generates a hash code based on the ID of the PositionType object.
    }
}
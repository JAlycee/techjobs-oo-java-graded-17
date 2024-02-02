package org.launchcode.techjobs.oo;

import java.util.Objects;

// This is the Location class that represents the location attribute in a job listing.
public class Location extends JobField {

    // Constructor for Location that takes a value (location) as a parameter and passes it to the superclass constructor.
    public Location(String aValue) {
        super(aValue);

    }

    @Override
    protected void getValue(String value) {

    }

    // Overrides the equals method to compare Location objects based on their IDs.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Checks if the objects being compared are the same instance.
        if (o == null || getClass() != o.getClass())
            return false; // Checks if the classes of the objects being compared are the same.
        Location that = (Location) o; // Casts the object 'o' to a Location object.
        return getId() == that.getId(); // Compares the IDs of the two Location objects.
    }

    // Overrides the hashCode method to generate a hash code based on the ID.
    @Override
    public int hashCode() {
        return Objects.hash(getId()); // Generates a hash code based on the ID of the Location object.
    }
}
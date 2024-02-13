package org.launchcode.techjobs.oo;

import java.util.Objects;

// This is the Location class that represents the location attribute in a job listing.
public class Location extends JobField {

    // Constructor for Location that takes a value (location) as a parameter and passes it to the superclass constructor.
    public Location(String aValue) {
        super(aValue);

    }

    // Overrides the hashCode method to generate a hash code based on the ID.
    @Override
    public int hashCode() {
        return Objects.hash(getId()); // Generates a hash code based on the ID of the Location object.
    }
}
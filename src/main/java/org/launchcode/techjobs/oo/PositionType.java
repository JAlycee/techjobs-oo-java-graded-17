package org.launchcode.techjobs.oo;

import java.util.Objects;

// This is the PositionType class that represents the position type attribute in a job listing.
public class PositionType extends JobField {

    // Constructor for PositionType that takes a value (position type) as a parameter and passes it to the superclass constructor.
    public PositionType(String value) {
        super(value);
    }

    // Overrides the hashCode method to generate a hash code based on the ID.
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId()); // Generates a hash code based on the ID of the PositionType object.
//    }
}
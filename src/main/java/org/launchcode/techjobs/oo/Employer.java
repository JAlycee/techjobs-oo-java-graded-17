package org.launchcode.techjobs.oo;

import java.util.Objects;

// This is the Employer class that represents the employer name in a job listing.
public class Employer extends JobField {

    // Constructor for Employer that takes a value (employer name) as a parameter and passes it to the superclass constructor.
    public Employer(String value) {
        super(value);
    }

    // Overrides the equals method to compare Employer objects based on their IDs.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employer that = (Employer) o;
        return getId() == that.getId();
    }

    // Overrides the hashCode method to generate a hash code based on the ID.
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

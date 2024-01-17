package org.launchcode.techjobs.oo;

import java.util.Objects;

// This is the CoreCompetency class that represents the core competency of a job.
public class CoreCompetency extends JobField{


    // Constructor for CoreCompetency
    public CoreCompetency(String value) {
        super(value);

    }

    // Overrides the equals method to compare CoreCompetency objects based on their IDs.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoreCompetency that = (CoreCompetency) o;
        return getId() == that.getId();
    }

    // Overrides the hashCode method to generate a hash code based on the ID.
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
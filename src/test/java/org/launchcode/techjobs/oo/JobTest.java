package org.launchcode.techjobs.oo;
import org.junit.Test;
import static org.junit.Assert.*;

public class JobTest {
    // Test for verifying unique ID generation for each Job instance
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
        // Correctly asserts that two different job instances have different IDs.
    }

    // Test for verifying that the job constructor correctly sets all fields
    @Test
    public void testJobConstructorSetsAllFields() {
        Job job1 = new Job("Product tester",
                new Employer("ACME"),
                new Location ("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        // Use of instanceof to ensure objects are of the correct class
        assertEquals("Product tester", job1.getName());
        assertEquals("ACME", job1.getEmployer().getValue());
        assertEquals("Desert", job1.getLocation().getValue());
        assertEquals("Quality control", job1.getPositionType().getValue());
        assertEquals("Persistence", job1.getCoreCompetency().getValue());
    }
    // Test for checking equality of Job objects based on IDs
    @Test
    public void testJobsForEquality() {
        Job job1 =
                new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        Job job2 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        // Correctly checks that two objects with the same field values but different IDs are not equal.
        assertNotEquals(job1, job2); // .equals() for object comparison vs assertNotEquals()
    }

    // Test for checking format of Job.toString() output
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job3 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        String string = job3.toString();
        // Correctly check for the newline at start and end of the output.
        assertTrue(string.startsWith(System.lineSeparator()));
        assertTrue(string.endsWith(System.lineSeparator()));
    }

    // Test for checking out the complete string output of Job.toString()
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job4 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
    // Dynamic ID generation
        String output = "\n"+
                "ID: " + job4.getId() + "\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n";
        assertEquals(output, job4.toString());
    }

    // Test for handling empty fields in Job.toString()
    @Test
    public void testToStringHandlesEmptyField() {
        Job job5 = new Job("Product tester",
                new Employer("ACME"),
                new Location(""),
                new PositionType("Quality control"),
                new CoreCompetency(""));
        // Dynamic ID generation
        String output = "\n"+
                "ID: " + job5.getId() + "\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Data not available\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Data not available\n";
        assertEquals(output, job5.toString());
    }

    // Test for handling a Job object that is empty except for the ID
    @Test
    public void testToStringHandlesEmptyInstantiation() {
        Job job6 = new Job();
        String output = "OOPS! This job does not seem to exist.";
        // Checks the special case where a Job object is created without setting any fields.
        assertEquals(output, job6.toString());
    }
}

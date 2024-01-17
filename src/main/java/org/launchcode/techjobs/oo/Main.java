package org.launchcode.techjobs.oo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Create Job objects with various attributes
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        Job job3 = new Job("Ice cream tester", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));

        // Create an ArrayList to store the Job objects
        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(job1); // Add job1 to the ArrayList
        jobs.add(job2); // Add job2 to the ArrayList
        jobs.add(job3); // Add job3 to the ArrayList

        // Iterate through the ArrayList and print each Job object using its toString method
        for (Job job : jobs) {
            System.out.println(job);
        }
    }
}
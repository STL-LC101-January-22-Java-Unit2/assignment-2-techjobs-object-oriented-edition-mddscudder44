package org.launchcode.techjobs.oo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class JobTest {
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        int job1ID = job1.getId();
        int job2ID = job2.getId();

        assertNotEquals(job1ID, job2ID);
    }


    @Test
    public void testJobConstructorSetsAllFields() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // 5 assertTrue  &   5 assertEquals
        //instanceof  -   check the class of an object
        //objectName instanceof ClassName

        assertEquals("Product tester", job1.getName());
        assertTrue(job1.getName() instanceof String);

        assertEquals("ACME", job1.getEmployer().getValue());
        assertTrue(job1.getEmployer() instanceof Employer);

        assertEquals("Desert", job1.getLocation().getValue());
        assertTrue(job1.getLocation() instanceof Location);


        assertEquals("Quality control", job1.getPositionType().getValue());
        assertTrue(job1.getPositionType() instanceof PositionType);

        assertEquals("Persistence", job1.getCoreCompetency().getValue());
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
    }


    //Jobs are = if same id.    Even if other fields differ
    //Jobs are != if dif id.    Even if other fields are identical.
    @Test
    public void testJobForEquality() {
        //Generate two Job objects that have identical field values EXCEPT for id.
        //Already know id's dont equal from passed test above
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // Test that *EQUALS* returns *FALSE*.
        //so if job1 .equals job2 retrun false
        assertFalse(job1.equals(job2));


    }


    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        //should return a string that contains a blank line before and after the job information.
        //check first & last *CHARACTERS* (charAT) of the *STRING* (toString) both = \n

        assertEquals('\n', job1.toString().charAt(0));
    }


    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        //Have label for each field
                // --"ID:" , "Name:" , "Employer" Etc.
        //followed by data stored in that field
                // -- "\nName: Product Tester"
        //Each should be on \n



        // assertEquals("\nID: " + job1.getId() + "\nName: Product Tester", job1.toString());


        String format =
                "\nID: " + job1.getId() +
                        "\nName: " + job1.getName() +
                        "\nEmployer: " + job1.getEmployer() +
                        "\nLocation: " + job1.getLocation() +
                        "\nPosition Type: " + job1.getPositionType() +
                        "\nCore Competency: " + job1.getCoreCompetency() +
                        "\n";


        assertEquals(format, job1.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        //test if ANY field is empty
        //Declare a test passing it ALL empty fields for it
        Job job1 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

        String format =
                "\nID: " + job1.getId() +
                        "\nName: " + "Data not available" +
                        "\nEmployer: " + "Data not available" +
                        "\nLocation: " + "Data not available" +
                        "\nPosition Type: " + "Data not available" +
                        "\nCore Competency: " + "Data not available" +
                        "\n";



        assertEquals(job1.toString(), format);
    }


}




























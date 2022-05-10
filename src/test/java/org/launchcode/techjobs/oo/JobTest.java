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

        // Test that *equals* returns *false*.
        //so if job1 .equals job2 retrun false
        assertFalse(job1.equals(job2));


    }

















}















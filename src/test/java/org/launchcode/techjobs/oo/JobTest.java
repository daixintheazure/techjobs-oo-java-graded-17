package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    Job testJob = new Job("Code tester", new Employer("CODE"), new Location("Eworld"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job testJob2;
    Job testjob3;

    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }

    @Test
    public void testSettingJobId() {
        int jobTwoValue = testJob2.getId();
        int jobThreeValue = testjob3.getId();
        assertNotEquals(jobTwoValue, jobThreeValue);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals(1, testJob.getId().longValue());
        assertTrue(Integer.class == testJob.getId().getClass());

        assertEquals("Code tester", testJob.getName());
        assertEquals(String.class, testJob.getName().getClass());

        assertEquals("CODE", testJob.getEmployer().getValue());
        assertEquals(Employer.class, testJob.getEmployer().getClass());

        assertEquals("Eworld", testJob.getLocation().getValue());
        assertEquals(Location.class, testJob.getLocation().getClass());

        assertEquals("Quality control", testJob.getPositionType().getValue());
        assertEquals(PositionType.class, testJob.getPositionType().getClass());

        assertEquals("Persistence", testJob.getCoreCompetency().getValue());
        assertEquals(CoreCompetency.class, testJob.getCoreCompetency().getClass());

    }



}

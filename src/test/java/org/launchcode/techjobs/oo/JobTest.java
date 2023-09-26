package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class JobTest {
    //TODO: Create your unit tests here

    Job testJob = new Job("Code tester", new Employer("CODE"), new Location("Eworld"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job testJob2 = new Job();
    Job testjob3 = new Job();

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
        assertEquals(Integer.class, testJob.getId().getClass());

        assertEquals("Code tester", testJob.getName());
        assertEquals(String.class, testJob.getName().getClass());

        assertEquals("CODE", testJob.getEmployer().getValue());
        assertEquals(Employer.class, testJob.getEmployer().getClass());


    }



}

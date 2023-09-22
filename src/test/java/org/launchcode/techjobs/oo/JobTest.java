package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JobTest {
    //TODO: Create your unit tests here

    Job testJob = new Job("Code tester", new Employer("CODE"), new Location("Eworld"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }
    @Test
    public void jobClassTest() {
        assertEquals("did not return job name Code tester", "Code tester",testJob.getName());
    }



}

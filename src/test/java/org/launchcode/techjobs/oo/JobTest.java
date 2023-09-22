package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JobTest {
    //TODO: Create your unit tests here

    Job job1 = new Job("Code tester", new Employer("CODE"), new Location("Eworld"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }



}

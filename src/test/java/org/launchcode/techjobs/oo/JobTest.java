package org.launchcode.techjobs.oo;

import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    Job testJob = new Job("Code tester", new Employer("CODE"), new Location("Eworld"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job testJob2 = new Job();
    Job testjob3 = new Job();
    Job testJob4 = new Job("Code tester", new Employer("CODE"), new Location("Eworld"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job testJob5 = new Job("", new Employer(), new Location(""), new PositionType(), new CoreCompetency(""));

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
        //Job testJob6 = new Job("Code tester", new Employer("CODE"), new Location("Eworld"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

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
    @Test
    public void testJobsForEquality() {
        assertEquals(false, testJob.equals(testJob4));
    }

    @Test
    public void testToStringFirstAndLastBlankSpace() {
        String s = System.lineSeparator();
        String firstChar = String.valueOf(testJob.toString().charAt(0));
        String lastChar = String.valueOf((testJob.toString().charAt(testJob.toString().length()-1)));
        assertEquals(firstChar,s);
        assertEquals(lastChar, s);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        String s = System.lineSeparator();
        String expectedOutput = s +
                              "ID: " + testJob.getId() + s +
                             "Name: " + testJob.getName() + s +
                             "Employer: " + testJob.getEmployer() + s +
                              "Location: " + testJob.getLocation() + s +
                             "Position Type: " + testJob.getPositionType() + s +
                             "Core Competency: " + testJob.getCoreCompetency()+ s;
        assertEquals(expectedOutput, testJob.toString());

    }

    @Test
    public void testToStringHandlesEmptyField() {
        String s = System.lineSeparator();
        String expectedOutput = s +
                "ID: " + testJob5.getId() + s +
                "Name: " + "Data not available" + s +
                "Employer: " + "Data not available" + s +
                "Location: " + "Data not available" + s +
                "Position Type: " + "Data not available" + s +
                "Core Competency: " + "Data not available" + s;
        assertEquals(expectedOutput, testJob5.toString());
    }

}

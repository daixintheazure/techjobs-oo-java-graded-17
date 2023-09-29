package org.launchcode.techjobs.oo;

import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.List;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job () {
        id = nextId++;
    }

    public Job (String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        id = nextId++;
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    public String isNull(String name) {
        String result = "Data not available";
        if (name != null) {
            result = name;
        }
        return result;
    }

    public String isNull(Employer employer) {
        String result = "Data not available";
        if(employer != null) {
            result = employer.getValue();
        }
        return result;
    }

    public String isNull(Location location) {
        String result = "Data not available";
        if(location != null) {
            result = location.getValue();
        }
        return result;
    }

    public String isNull(PositionType positionType) {
        String result = "Data not available";
        if(positionType != null) {
            result = positionType.getValue();
        }
        return result;
    }

    public String isNull(CoreCompetency coreCompetency) {
        String result = "Data not available";
        if(coreCompetency != null) {
            result = coreCompetency.getValue();
        }
        return result;
    }

    @Override
    public String toString() {
        String s = System.lineSeparator();
        String noData = "Data not available";

        String chkEmployer = employer.getValue();



        List outPuts = new ArrayList();
        outPuts.add(name);
        outPuts.add(chkEmployer);
        outPuts.add(location);
        outPuts.add(positionType);
        outPuts.add(coreCompetency);

        for (Object o: outPuts) {
            if(o == null || o == "") {
                o = noData;
            }
        }

        String jobInfo = s +
                "ID: " + id + s +
                "Name: " + isNull(name) + s +
                "Employer: " + outPuts.get(1) + s +
                "Location: " + isNull(location) + s +
                "Position Type: " + isNull(positionType) + s +
                "Core Competency: " + isNull(coreCompetency) + s;

        return jobInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}

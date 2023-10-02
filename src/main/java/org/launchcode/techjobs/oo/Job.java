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

    @Override
    public String toString() {
        String s = System.lineSeparator();
        String noData = "Data not available";

        List<Object> inPuts = new ArrayList<>();
        List<String> checkedNull = new ArrayList<>();
        List<Object> outPuts = new ArrayList<>();
        inPuts.add(name);
        inPuts.add(employer);
        inPuts.add(location);
        inPuts.add(positionType);
        inPuts.add(coreCompetency);

        for (Object i : inPuts) {
            if(i == null) {
                checkedNull.add(i.toString());
            } else {
                checkedNull.add(noData);
            }
        }

        for (String j : checkedNull) {
            if (j.isBlank() || j.isEmpty()) {
                outPuts.add(noData);
            } else {
                outPuts.add(j);
            }

        }

        String jobInfo = s +
                "ID: " + id + s +
                "Name: " + outPuts.get(0) + s +
                "Employer: " + outPuts.get(1) + s +
                "Location: " + outPuts.get(2) + s +
                "Position Type: " + outPuts.get(3) + s +
                "Core Competency: " + outPuts.get(4) + s;

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

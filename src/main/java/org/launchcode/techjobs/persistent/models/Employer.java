package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    //private List<Job> jobs = new Job

    @NotNull(message= "Location is required")
    @Size(min=5, max=50, message="Location must be between 5 and 50 characters")
    private String location;

    public Employer(String location) {
        super();
        this.location = location;
    }

    public Employer() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}

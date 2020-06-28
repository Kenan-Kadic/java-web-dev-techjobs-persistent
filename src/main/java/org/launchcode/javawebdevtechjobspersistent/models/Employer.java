package org.launchcode.javawebdevtechjobspersistent.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Employer extends AbstractEntity {

    @NotBlank(message = "Location is required")
    @Size(min = 1, max = 100, message = "Location must be between 1 and 100 characters long")
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

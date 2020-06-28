package org.launchcode.javawebdevtechjobspersistent.models;

import javax.validation.constraints.Size;

public class Skill extends AbstractEntity {

    @Size(max = 500, message = "Description too long")
    private String description;

    public Skill() {
    }

    public String getDescription() {
            return description;
    }

    public void setDescription(String description) {
        this.description = description;
        }
    }

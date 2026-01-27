package ourbusinessproject;

import jakarta.validation.constraints.NotBlank;


public class Project {
    @NotBlank
    private String title;
    private String description;

    Project () {
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;

    }

    public void setDescription (String description){
        this.description = description;
    }

}

package ourbusinessproject;

import jakarta.validation.constraints.NotBlank;


public class Project {
    @NotBlank
    private String title;
    private String description;

    /**
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the title
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;

    }

    /**
     * Set the description
     * @param description the description
     */
    public void setDescription (String description){
        this.description = description;
    }

}

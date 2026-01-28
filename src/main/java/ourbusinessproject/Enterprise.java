package ourbusinessproject;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.beans.PropertyValues;

import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String name;
    @Size(min = 10)
    private String description;
    @NotBlank
    private String contactName;
    @NotBlank @Email
    private String contactEmail;
    @OneToMany (mappedBy = "enterprise")
    private Collection<Project> projects;
    /**
     *
     * @param name ..
     */
    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public Collection<Project> getProjects() {
        return projects;
    }
    public void addProject (Project project) {
        if (projects == null) {
            projects = new ArrayList<>();
        }
        projects.add(project);
    }
}
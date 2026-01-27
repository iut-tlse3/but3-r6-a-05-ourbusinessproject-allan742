package ourbusinessproject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotBlank
    private String Name;
    @Size(min = 10)
    private String Description;
    @NotBlank
    private String ContactName;
    @NotBlank @Email
    private String ContactEmail;

    /**
     * Set the name
     * @param name the name
     */
    public void setName(String name) {
        this.Name = name;
    }

    /**
     * Set the name
     * @param description the description
     */
    public void setDescription (String description) {
        this.Description = description;
    }

    /**
     * Set the contactName
     * @param contactName the contactName
     */
    public void setContactName (String contactName) {
        this.ContactName = contactName;
    }

    /**
     * Set the contactEmail
     * @param contactEmail the contactEMail
     */
    public void setContactEmail (String contactEmail) {
        this.ContactEmail = contactEmail;
    }
}

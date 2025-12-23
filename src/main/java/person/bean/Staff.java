package person.bean;

import java.io.Serializable;

/**
 * Staff JavaBean implementing Serializable.
 */
public class Staff implements Serializable {

    private int age;
    private String firstname;
    private String lastname;
    // private static final long serialVersionUID = 1L; // Optional

    public Staff() {
    }

    public Staff(int age, String firstname, String lastname) {
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // --- New Method for Task 1: getFullName() ---
    /**
     * Concatenates and returns the staff member's full name.
     * @return The full name (Firstname Lastname).
     */
    public String getFullName() {
        return this.firstname + " " + this.lastname;
    }

    // --- New Method for Task 2: getAgeCategory() ---
    /**
     * Classifies the staff member's age into categories.
     * @return A string representing the age category ("Child", "Adult", or "Senior").
     */
    public String getAgeCategory() {
        if (this.age < 18) {
            return "Child";
        } else if (this.age >= 65) {
            return "Senior";
        } else {
            return "Adult";
        }
    }

    // --- Existing Getters and Setters ---
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
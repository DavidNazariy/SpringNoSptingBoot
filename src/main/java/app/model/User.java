package app.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
    private Long id;
    private  String firstName;
    private  String middleName;
    private  String lastName;
    private Date dateOfBirthday;
    private Date dateRegistration;
    private String email;
    private String password;
    private String role;

    public User(Long id, String firstName, String middleName, String lastName, Date dateOfBirthday, Date dateRegistration, String email, String password, String role) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirthday = dateOfBirthday;
        this.dateRegistration = dateRegistration;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(Date dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public Date getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(Date dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirthday=" + dateOfBirthday +
                ", dateRegistration=" + dateRegistration +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

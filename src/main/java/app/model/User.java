package app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "user")
public class User implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name")
    private  String firstName;

    @Column(name = "middle_name")
    private  String middleName;

    @Column(name = "last_name")
    private  String lastName;

    @Column(name = "date_of_birth")
    private Date dob;

    @Column(name = "user_password")
    private String password;

    @Column(name = "date_of_registration")
    private Date date_of_registration;

    @Column(name = "email")
    private String email;

    @Column(name = "user_role")
    private String role;

    public User(Long id, String firstName, String middleName,
                String lastName, Date dob, String password,
                Date date_of_registration, String email, String role) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dob = dob;
        this.password = password;
        this.date_of_registration = date_of_registration;
        this.email = email;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

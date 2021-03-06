package fr.picom.picomspring.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;
//TODO ADD JSON IGNORE WHEN is util !!
@Entity
@Table(name = "user2")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Veuillez renseigner votre nom")
    private String lastName;

    @NotEmpty(message = "Veuillez renseigner votre prénom")
    private String firstName;

    @Email(message = "Veuillez saisir un email correct")
    @NotEmpty(message = "Veuillez renseigner votre email")
    private String email;


    private String password;

    private String phoneNumber;

    private boolean isVerified;

    @NotEmpty(message = "Veuillez renseigner votre numéro siret")
    @Size(min = 13, max = 15, message = "Votre numéro siret doit avoir 14 chiffres")
    private String numSiret;

    private String companyName;

    private String roadName;

    private String postalCode;

    @ManyToOne
    private City city;

    @ManyToOne
    private Role role;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Ad> adList;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public String getNumSiret() {
        return numSiret;
    }

    public void setNumSiret(String numSiret) {
        this.numSiret = numSiret;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Ad> getAdList() {
        return adList;
    }

    public void setAdList(List<Ad> adList) {
        this.adList = adList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", isVerified=" + isVerified +
                ", numSiret='" + numSiret + '\'' +
                ", companyName='" + companyName + '\'' +
                ", roadName='" + roadName + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city=" + city +
                ", role=" + role +
                '}';
    }
}

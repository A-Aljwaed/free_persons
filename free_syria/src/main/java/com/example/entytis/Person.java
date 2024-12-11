package com.example.entytis;




import jakarta.persistence.*;



@Entity

@Table(name = "person")

public class Person {

    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy= GenerationType.TABLE)
    private Long id;

    @Column(name = "status",nullable = false)
    private String status;

    @Column(name ="ort",nullable = false)
    private String ort;

    @Column(name="lastname",nullable = false)
    private String lastname;

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLetzteWohnort() {
        return letzteWohnort;
    }

    public void setLetzteWohnort(String letzteWohnort) {
        this.letzteWohnort = letzteWohnort;
    }

    @Column(name ="letzetWohnort",nullable = true)
    private String letzteWohnort;

    public Person(String status, String firstName, String contact) {
        this.status = status;
        this.firstName = firstName;
        this.contact = contact;
    }

    public Person() {
    }
    @Column(name = "firstName",nullable = false)
    private String firstName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Column(name = "contact")
    private String contact;


}

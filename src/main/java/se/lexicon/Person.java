package se.lexicon;

public class Person {
    private int id;
    private String firstName;

    private String lastName;

    private String email;

    //Constructor
    public Person(int id,String firstName,String lastName,String email)
    {
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;


    }
    //Getter & Setter
    public int getId()
    {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) throw new IllegalArgumentException("First name not be null");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) throw new IllegalArgumentException("Lastname not be null");
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null) throw new IllegalArgumentException("Email not be null");
        this.email = email;
    }
    public String getSummary() {
        return "{ ID:" + id + "Name:" + firstName + " " + lastName + " , Email: " + email + " }";
    }
    }


package nl.hrmanagement.attendance.model;

import java.util.List;

public class Company {
    private int id;
    private String name;
    private String taxId;
    private List<User> employees;
    private int registrationNumber;
    private String phone;
    private String mail;
    private String addressOne;
    private String addressTwo;
    private String city;
    private String zipcode;
    private String country;
    private List<Function> functions;

    public Company(){

    }

    public Company(int id, String name, String taxId, List<User> employees, int registrationNumber, String phone, String mail, String addressOne, String addressTwo, String city, String zipcode, String country, List<Function> functions) {
        this.id = id;
        this.name = name;
        this.taxId = taxId;
        this.employees = employees;
        this.registrationNumber = registrationNumber;
        this.phone = phone;
        this.mail = mail;
        this.addressOne = addressOne;
        this.addressTwo = addressTwo;
        this.city = city;
        this.zipcode = zipcode;
        this.country = country;
        this.functions = functions;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public List<User> getEmployees() {
        return employees;
    }

    public void setEmployees(List<User> employees) {
        this.employees = employees;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddressOne() {
        return addressOne;
    }

    public void setAddressOne(String addressOne) {
        this.addressOne = addressOne;
    }

    public String getAddressTwo() {
        return addressTwo;
    }

    public void setAddressTwo(String addressTwo) {
        this.addressTwo = addressTwo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Function> getFunctions() {
        return functions;
    }

    public void setFunctions(List<Function> functions) {
        this.functions = functions;
    }
}

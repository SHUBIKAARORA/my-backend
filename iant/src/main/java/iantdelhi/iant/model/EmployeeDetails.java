package iantdelhi.iant.model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.sql.Date;

@Entity
@Table(name = "iant_employee_details")
public class EmployeeDetails {
    @Id
    private String empId;

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Date dob;
    private String address;
    private String gender;
    private String qualification;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private RoleDetails role;

    private String idProofType;
    private String idProofNumber;

    @Lob
    private byte[] idDocument;

    private Date joiningDate;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    // Getters and setters

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public RoleDetails getRole() {
        return role;
    }

    public void setRole(RoleDetails role) {
        this.role = role;
    }

    public String getIdProofType() {
        return idProofType;
    }

    public void setIdProofType(String idProofType) {
        this.idProofType = idProofType;
    }

    public String getIdProofNumber() {
        return idProofNumber;
    }

    public void setIdProofNumber(String idProofNumber) {
        this.idProofNumber = idProofNumber;
    }

    public byte[] getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(byte[] idDocument) {
        this.idDocument = idDocument;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}

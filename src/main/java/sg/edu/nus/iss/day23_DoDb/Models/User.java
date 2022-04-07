package sg.edu.nus.iss.day23_DoDb.Models;

import java.sql.Date;

import org.springframework.jdbc.support.rowset.SqlRowSet;

public class User {

    private String email;
    private String name;
    private String phone;
    private String status;
    private Date dob;
    private String passPhrase;

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public String getPassPhrase() {
        return passPhrase;
    }
    public void setPassPhrase(String passPhrase) {
        this.passPhrase = passPhrase;
    }

    public User(String email, String name, String phone, String status, Date dob, String passPhrase){
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.status = status;
        this.dob = dob;
        this.passPhrase = passPhrase;
    }
    public User(){}

    @Override
    public String toString() {
        return "User [dob=" + dob + ", email=" + email + ", name=" + name + ", passPhrase=" + passPhrase + ", phone="
                + phone + ", status=" + status + "]";
    };

    public static User create(SqlRowSet rs){
        User user = new User();
        user.setEmail(rs.getString("email"));
        user.setName(rs.getString("name"));
        user.setPhone(rs.getString("phone"));
        user.setDob(rs.getDate("dob"));
        user.setStatus(rs.getString("status"));
        user.setPassPhrase(rs.getString("pass_phrase"));

        return user;
    }
    
}

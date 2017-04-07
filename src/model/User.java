package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User {

    private long userId = 99;
    private String firstName, lastName, position, mobile, email, user, password, role, faculty;
    private static int count;
    Connection con = ConnectionBuilder.getConnection();

    public void login(String user, String pass) {
        if (user.equals(this.user) && password.equals(this.password)) {

        }
    }

    public void logout() {
        userId = 0;
    }

    public void register(String firstname, String lastname, String role, String position, String mobile, String email, String user, String pass, String faculty) throws SQLException {
        PreparedStatement regis
                = con.prepareStatement("INSERT INTO `user` (`userid`, `firstname`, `lastname`, `mobile`, `role`, `username`, `password`, `position`, `faculty`) "
                        + "VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?);");
        regis.setString(1, firstname);
        regis.setString(2, lastname);
        regis.setString(3, mobile);
        regis.setString(4, role);
        regis.setString(5, user);
        regis.setString(6, pass);
        regis.setString(7, position);
        regis.setString(8, faculty);
        regis.executeUpdate();

        this.firstName = firstname;
        this.lastName = lastname;
        this.position = position;
        this.mobile = mobile;
        this.email = email;
        this.user = user;
        this.password = pass;
        this.role = role;
        this.faculty = faculty;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Username : " + user + " Password : " + password
                + "\nFirstName : " + firstName + " LastName : " + lastName
                + "\nMobile : " + mobile
                + "\nRole : " + role + " Position : " + position
                + "\nEmail : " + email;
    }

}

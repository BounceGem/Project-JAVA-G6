package model;

import java.sql.*;

public class Account extends Place {

    private String accountId;
    private Place place;
    private String status;
    private double balance;
    private Transaction transaction;
    Connection con = ConnectionBuilder.getConnection();

    public void deposit(double amount) throws SQLException {
        PreparedStatement dopos = con.prepareStatement("UPDATE account SET blance=? WHERE accountid=?");
        dopos.setDouble(1, this.getBalance() + amount);
        dopos.setString(2, accountId);
        dopos.executeUpdate();
    }

    public void withdraw(double amount) throws SQLException {
        PreparedStatement with = con.prepareStatement("UPDATE account SET blance=? WHERE accountid=?");
        with.setDouble(1, this.getBalance() - amount);
        with.setString(2, accountId);
        with.executeUpdate();
    }

    public void findById(long accountId) {

    }

    public void query() {

    }

    public void addTransaction() {

    }

    public static void orm(ResultSet rs, Account account, Place place) throws SQLException {
        account.setAccountId(rs.getString("accountid"));
        account.setBalance(rs.getDouble("blance"));
        account.setStatus(rs.getString("status"));
        account.setPlace(place);
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "Account{" + "accountId=" + accountId + ", place=" + place.getPlaceName() + ", status=" + status + ", balance=" + balance;
    }

}

package model;

import java.sql.*;

public class Account extends Place {
    
    private String accountId;
    private Place place;
    private String status;
    private double balance;
    private Transaction transaction;
    
    public void deposit(double amount) {
        this.balance += amount;
    }
    
    public void withdraw(double amount) {
        this.balance -= amount;
    }
    
    public void findById(long accountId) {
        
    }
    
    public void query() {
        
    }
    
    public void addTransaction() {
        
    }
    
    public static void orm(ResultSet rs, Account account) throws SQLException {
        account.setAccountId(rs.getString("accountid"));
        account.setBalance(rs.getDouble("blance"));
        account.setStatus(rs.getString("status"));
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
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author pupil
 */
public class Custumer implements  Serializable{
    String firstname;
    String lastname;
    String phone;
    int balance;
    
        public Custumer() {
    }
        
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
     @Override
    public String toString() {
        return "Custumer{" 
                + "\n firstname=" + firstname 
                + ",\n lastname=" + lastname 
                + ",\n phone=" + phone 
                + ",\n balance=" + balance
                +
                "\n }";
    }
}

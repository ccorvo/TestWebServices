/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corvo.webservices;

/**
 *
 * @author ccorvo
 */


public class Address {
    
  
    String line1;
    
 
    String city;
    

    String state;
    

    String zipcode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    
    
    
}

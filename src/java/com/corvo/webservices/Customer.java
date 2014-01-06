/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corvo.webservices;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ccorvo
 */
@XmlRootElement(name = "customer")   //This name represents the root element in the generated XML file

public class Customer {
    
 
    String customerName;
   
    int customerId;
  
    Address address;

    

    public void setAddress(Address address) {
        this.address = address;
    }
    
    public Customer(){
        
        
    }
    
    @XmlElement(name = "customer_address")   //Without this annotation, JAXB will not add field to XML tree
    public Address getAddress() {
        return this.address;
    }
    
    
    @XmlElement( name = "customer_id")
    public int getCustomerId() {
        return customerId;
    }
    
     @XmlElement(name = "customer_name") 
    public String getCustomerName() {
        return customerName;
    }
    
    public void setCustomerName( String name){
        
        customerName = name;
    }

    public void setCustomerId (int id){
        customerId = id;
    }
};



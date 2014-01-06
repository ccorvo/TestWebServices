/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corvo.webservices;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

/**
 * REST Web Service
 *
 * @author ccorvo
 */
@Path("/MD5RestService")
//{hashString}")
@RequestScoped
public class MD5RestServiceResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of MD5RestServiceResource
     */
    public MD5RestServiceResource() {
    }

    /**
     * Retrieves representation of an instance of com.corvo.webservices.MD5RestServiceResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/html")
    @Path("HashString/{inputString}")
    
    public String MD5RestService(@PathParam("inputString") String inputHashString )
    {
        
        //use the context object to get a list of parameters attached to the URI
        //MultivaluedMap<String,String> queryParam = context.getQueryParameters();
        
     
        
        try {    
            
            return inputHashString;
         // return "<html> <body> Hash String is: + inputHashString  + </body> </html>";          
        //return "<html> <body> Hash String is:" + queryParam.getFirst("hashString") "</body> </html>";
        } 
        catch (Exception ex) 
        {            
         
        return "";                 
        } 
    }
    @GET
    @Produces("text/html")
    @Path("getString/{inputString}")
    
    public String getStringCall(@PathParam("inputString") String inputHashString )
    {
        
        //use the context object to get a list of parameters attached to the URI
        //MultivaluedMap<String,String> queryParam = context.getQueryParameters();
        
     
        
        try {    
            
            return inputHashString;
         // return "<html> <body> Hash String is: + inputHashString  + </body> </html>";          
        //return "<html> <body> Hash String is:" + queryParam.getFirst("hashString") "</body> </html>";
        } 
        catch (Exception ex) 
        {            
         
        return "";                 
        } 
    }
    
    // If the GET request requires an application XML response, the following method will be called.
    @GET
    @Produces (MediaType.APPLICATION_XML)
    @Path("Customer/{inputString}")
    public Customer getCustomer( @PathParam("inputString") int customerId)
    {
       
            Customer customerObject = new Customer();
            customerObject.setCustomerName("Christopher Corvo");
            customerObject.setCustomerId(customerId);
            
            Address myaddress = new Address();
            myaddress.setCity("Lumberton");
            myaddress.setLine1("5 Stonehenge Drive");
            myaddress.setState("New Jersey");
            myaddress.setZipcode("08048"); 
            customerObject.setAddress(myaddress);
        
        return customerObject;
        
    }
    
    //If the GET Request requires an application-JSON response, the following method will be called.
  @GET
    @Produces (MediaType.APPLICATION_JSON)
    @Path("Customer/{inputString}")
    public Customer getCustomerJson( @PathParam("inputString") int customerId)
    {
       
            Customer customerObject = new Customer();
            customerObject.setCustomerName("Christopher Corvo");
            customerObject.setCustomerId(customerId);
            
            Address myaddress = new Address();
            myaddress.setCity("Lumberton");
            myaddress.setLine1("5 Stonehenge Drive");
            myaddress.setState("New Jersey");
            myaddress.setZipcode("08048"); 
            customerObject.setAddress(myaddress);
        
        return customerObject;
        
    }  
    
  
  
  
  
  
        //TODO return proper representation object
       // throw new UnsupportedOperationException();
    
   /**
     * PUT method for updating or creating an instance of MD5RestServiceResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
  @POST
   @Consumes("text/html")
   public String putHtml(String content) {
    
        return "This is my Post Return Message";
    }

  
  
  
  
}

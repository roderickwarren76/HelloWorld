/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rodney.helloworld.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author roderick.warren
 */
// Use the hello resource URI for this resource
@Path("/hello")
public class HelloResource {
    // Using the Get Method 
    @GET
    // Produces Plain Text instead JSON text, you can change this to any type
    @Produces(MediaType.TEXT_PLAIN)
    public String getGreeting(){
        return "Hello JAVA World";
    }
}

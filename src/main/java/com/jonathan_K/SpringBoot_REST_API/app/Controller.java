/**
 * 
 */
package com.jonathan_K.SpringBoot_REST_API.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JONATHAN
 */
@RestController
@RequestMapping("/rest/api")
public class Controller {

   @GetMapping("/hello")
    public String sayHello() {
	return "Hi Jonathan K";
    }
    
  @PostMapping("/post")
    public String postRequest(@RequestBody String message) {
	
	return "Hi Jonathan K , you posted this : "+message ;
    }
    
  @PostMapping("/post-order")
  public String postRequest(@RequestBody Order order) {
	
	return "Hi Jonathan K , you posted this : "+order.toString() ;
  }
  
  @PostMapping("/post-record-order")
  public String postRequest(@RequestBody OrderRecord order) {
	
	return "Hi Jonathan K , you posted this record order: "+order.toString() ;
  }
   
  
    // working with parameters
  //http://localhost:8080//rest/api/hello/{value}
  //@PathVariable extracts values from url path
  //used when value you is part of URI
  @GetMapping("/hello/{user-name}")
  public String pathVar(@PathVariable("user-name") String userName) {
	return "My value = "+userName;
  }
  
  // working with parameters request param
  //http://localhost:8080//rest/api/hello?param_name=paramValue&param_value2=value2
 //extracts query params from url, context info for request using ? and & symbols
  //used when value is passed as query parameter
  
  @GetMapping("/hello")
  public String pathVar(
	  @RequestParam("user-name") String userName,
	  @RequestParam("user-lastname") String userlastName
	  
	  ) {
	return "My usernames are = "+userName+ "  "+userlastName;
  }
  
  
  
  
}

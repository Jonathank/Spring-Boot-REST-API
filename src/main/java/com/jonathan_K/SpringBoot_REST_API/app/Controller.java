/**
 * 
 */
package com.jonathan_K.SpringBoot_REST_API.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
  
  
    
}

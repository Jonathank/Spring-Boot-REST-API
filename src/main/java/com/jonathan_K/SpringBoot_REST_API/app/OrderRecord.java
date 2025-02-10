/**
 * 
 */
package com.jonathan_K.SpringBoot_REST_API.app;

/**
 * @author JONATHAN
 */
public record OrderRecord(
	String customerName,
	String productName,
	int quantity
	) {

}

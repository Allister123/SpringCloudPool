/**
 * 
 * com.ic2c<BR>
 * ServiceZuulApplication.java<BR>
 * @author Allister.Liu(刘继鹏) <BR>
 * Date：2017年9月25日-上午11:31:04<BR> 
 * 2017
 */
package com.ic2c;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 
 * ServiceZuulApplication<BR>
 * @author Allister.Liu(刘继鹏) <BR>
 * Date：2017年9月25日-上午11:31:04 <BR>
 * @version 1.0.0
 * 
 */

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ServiceZuulApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceZuulApplication.class, args);
	}
}

/**
 * 
 * com.ic2c<BR>
 * ServiceFeignApplication.java<BR>
 * @author Allister.Liu(刘继鹏) <BR>
 * Date：2017年9月21日-下午4:49:25<BR> 
 * 2017
 */
package com.ic2c;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 
 * ServiceFeignApplication<BR>
 * @author Allister.Liu(刘继鹏) <BR>
 * Date：2017年9月21日-下午4:49:25 <BR>
 * @version 1.0.0
 * 
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceFeignApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceFeignApplication.class, args);
	}
}

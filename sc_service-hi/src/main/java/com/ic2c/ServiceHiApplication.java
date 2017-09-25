/**
 * 
 * com.ic2c<BR>
 * ServiceHiApplication.java<BR>
 * @author Allister.Liu(刘继鹏) <BR>
 * Date：2017年9月21日-上午10:42:46<BR> 
 * 2017
 */
package com.ic2c;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * ServiceHiApplication<BR>
 * @author Allister.Liu(刘继鹏) <BR>
 * Date：2017年9月21日-上午10:42:46 <BR>
 * @version 1.0.0
 * 
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceHiApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceHiApplication.class, args);
	}
	
	
	@Value("${server.port}")
    String port;
	
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }
}

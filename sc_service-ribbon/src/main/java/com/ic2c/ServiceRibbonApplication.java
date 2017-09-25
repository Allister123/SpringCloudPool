/**
 * 
 * com.ic2c<BR>
 * ServiceRibbonApplication.java<BR>
 * @author Allister.Liu(刘继鹏) <BR>
 * Date：2017年9月21日-下午2:03:40<BR> 
 * 2017
 */
package com.ic2c;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * ServiceRibbonApplication<BR>
 * @author Allister.Liu(刘继鹏) <BR>
 * Date：2017年9月21日-下午2:03:40 <BR>
 * @version 1.0.0
 * 
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceRibbonApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceRibbonApplication.class, args);
	}
	
	
	/**
	 * 在工程的启动类中,通过@EnableDiscoveryClient向服务中心注册；并且向程序的ioc注入一个bean: restTemplate;
	 * 并通过@LoadBalanced注解表明这个restRemplate开启负载均衡的功能。
	 * 方法名：restTemplate<BR>
	 * @author Allister.Liu(刘继鹏) <BR>
	 * Date：2017年9月21日-下午2:06:11 <BR>
	 * @return RestTemplate<BR>
	 * @exception <BR>
	 * @since  1.0.0
	 */
	@Bean
	@LoadBalanced
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
}

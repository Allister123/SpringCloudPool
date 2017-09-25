/**
 * 
 * com.ic2c.service<BR>
 * HelloService.java<BR>
 * @author Allister.Liu(刘继鹏) <BR>
 * Date：2017年9月21日-下午2:07:09<BR> 
 * 2017
 */
package com.ic2c.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * HelloService<BR>
 * @author Allister.Liu(刘继鹏) <BR>
 * Date：2017年9月21日-下午2:07:09 <BR>
 * @version 1.0.0
 * 
 */

@Service
public class HelloService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	public String hiService(String name){
		return restTemplate.getForObject("http://SC-SERVICE-HI/hi?name="+name, String.class);
	}
}

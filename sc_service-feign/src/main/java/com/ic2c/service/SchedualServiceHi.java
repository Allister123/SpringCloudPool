/**
 * 
 * com.ic2c.service<BR>
 * SchedualServiceHi.java<BR>
 * @author Allister.Liu(刘继鹏) <BR>
 * Date：2017年9月21日-下午4:51:30<BR> 
 * 2017
 */
package com.ic2c.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 * SchedualServiceHi<BR>
 * @author Allister.Liu(刘继鹏) <BR>
 * Date：2017年9月21日-下午4:51:30 <BR>
 * @version 1.0.0
 * 
 */

@FeignClient("sc-service-hi")
public interface SchedualServiceHi {
	
	
	@RequestMapping(value = "hi", method = RequestMethod.GET)
	String sayHiFromClientOne(@RequestParam(value = "name") String name);
	
}

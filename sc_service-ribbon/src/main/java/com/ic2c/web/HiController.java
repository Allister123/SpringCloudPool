/**
 * 
 * com.ic2c.web<BR>
 * HiController.java<BR>
 * @author Allister.Liu(刘继鹏) <BR>
 * Date：2017年9月21日-下午2:18:59<BR> 
 * 2017
 */
package com.ic2c.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ic2c.service.HelloService;

/**
 * 
 * HiController<BR>
 * @author Allister.Liu(刘继鹏) <BR>
 * Date：2017年9月21日-下午2:18:59 <BR>
 * @version 1.0.0
 * 
 */

@RestController
public class HiController {
	
	@Autowired
	private HelloService helloService;
	
	@RequestMapping("/hi")
	public String hi(@RequestParam String name){
		return helloService.hiService(name);
	}
}

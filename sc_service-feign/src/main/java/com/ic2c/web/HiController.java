/**
 * 
 * com.ic2c.web<BR>
 * HiController.java<BR>
 * @author Allister.Liu(刘继鹏) <BR>
 * Date：2017年9月21日-下午5:11:20<BR> 
 * 2017
 */
package com.ic2c.web;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ic2c.service.SchedualServiceHi;

/**
 * 
 * HiController<BR>
 * @author Allister.Liu(刘继鹏) <BR>
 * Date：2017年9月21日-下午5:11:20 <BR>
 * @version 1.0.0
 * 
 */

@RestController
public class HiController {
	
	@Resource
	private SchedualServiceHi schedualServiceHi;
	
	@RequestMapping("/sayHi")
	public String saayHello(String name){
		return schedualServiceHi.sayHiFromClientOne(name);
	}
	
	
}

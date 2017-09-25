/**
 * 
 * com.ic2c<BR>
 * EurekaserverApplication.java<BR>
 * @author Allister.Liu(刘继鹏) <BR>
 * Date：2017年9月21日-上午10:22:06<BR> 
 * 2017
 */
package com.ic2c;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka是一个高可用的组件，它没有后端缓存，每一个实例注册之后需要向注册中心发送心跳（因此可以在内存中完成），在默认情况下erureka server也是一个eureka client ,
 * 必须要指定一个 server
 * EurekaserverApplication<BR>
 * @author Allister.Liu(刘继鹏) <BR>
 * Date：2017年9月21日-上午10:22:06 <BR>
 * @version 1.0.0
 * 
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaserverApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaserverApplication.class, args);
	}
}

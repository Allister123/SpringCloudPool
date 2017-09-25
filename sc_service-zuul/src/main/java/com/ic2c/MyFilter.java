/**
 * 
 * com.ic2c<BR>
 * MyFilter.java<BR>
 * @author Allister.Liu(刘继鹏) <BR>
 * Date：2017年9月25日-下午4:15:22<BR> 
 * 2017
 */
package com.ic2c;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * 
 * MyFilter<BR>
 * @author Allister.Liu(刘继鹏) <BR>
 * Date：2017年9月25日-下午4:15:22 <BR>
 * @version 1.0.0
 * 
 */
@Component
public class MyFilter extends ZuulFilter{
	
	private static final Logger log = LoggerFactory.getLogger(MyFilter.class);
	

	@Override
	public Object run() {
		RequestContext qc = RequestContext.getCurrentContext();
		HttpServletRequest request = qc.getRequest();
		log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
		String token = request.getParameter("token");
		
		if(StringUtils.isEmpty(token)){
			log.info("token is empty!!!");
			qc.setSendZuulResponse(false);
			qc.setResponseStatusCode(401);
			try{
				qc.getResponse().getWriter().write("token is empty!!!");
			}catch(IOException e){
				log.error("error");
				e.printStackTrace();
			}
			return null;
		}
		log.info("ok");
		return null;
	}

	//可以写逻辑判断，是否要过滤，本文true,永远过滤。
	@Override
	public boolean shouldFilter() {
		return true;
	}

	//过滤的顺序
	@Override
	public int filterOrder() {
		return 0;
	}

	//路由之前    routing：路由之时          post： 路由之后
	@Override
	public String filterType() {
		return "pre";
	}
}

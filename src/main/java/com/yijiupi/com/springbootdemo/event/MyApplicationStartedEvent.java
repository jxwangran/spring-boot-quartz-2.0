/**   
 * Copyright © 2018 北京易酒批电子商务有限公司. All rights reserved.
 */
package com.yijiupi.com.springbootdemo.event;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ConfigurableApplicationContext;

/**    
* @Title: MyApplicationStartedEvent.java  
* @Package com.yijiupi.com.springbootdemo.event  
* @Description: 
* @author wangran 
* @date 2018年9月27日 上午11:15:58  
* @version V1.0    
*/
public class MyApplicationStartedEvent extends ApplicationStartedEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param application
	 * @param args
	 * @param context
	 */
	public MyApplicationStartedEvent(SpringApplication application, String[] args,
			ConfigurableApplicationContext context) {
		super(application, args, context);
		System.err.println();
	}

}

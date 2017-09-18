package com.xzsoft.seleniumtest.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
@Component
public class SpringBeanFactory implements ApplicationContextAware{

	private static ApplicationContext appContext;
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		SpringBeanFactory.appContext = applicationContext;
	}
	
	public static <T> T getBean(String beanName){
		return (T)appContext.getBean(beanName);
	}
}

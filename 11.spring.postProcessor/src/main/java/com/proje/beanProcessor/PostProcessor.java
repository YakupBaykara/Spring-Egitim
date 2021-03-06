package com.proje.beanProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor {

		public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
			
			System.out.println("Bean oluşturulduktan sonra : " +beanName+" : " + bean);
			return bean;
		}
		
		public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
			
			System.out.println("Bean oluşturulmadan önce : " +beanName+" : " + bean);
			return bean;
		}
}

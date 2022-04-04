package com.proje.bean_factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanFactory implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
	// Bu metod applicationContext okunduğu anda veya AppConfig okunduğu anda çalışır.	
		
		System.out.println("applicationContext.xml okunurken bean lar context e yüklenirken çalıştı ");
		System.out.println("Tanımlanan Bean sayısı : " +beanFactory.getBeanDefinitionCount());
		System.out.println("----------------------------------");
	}

}

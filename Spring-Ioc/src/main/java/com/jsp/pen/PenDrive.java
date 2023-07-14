package com.jsp.pen;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PenDrive {

	public static void main(String[] args) {
		ClassPathResource classPathResource=new ClassPathResource("MySpring.xml");
		
		BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
		
		Pen pen =(Pen)beanFactory.getBean("mypen");
		

	}

}

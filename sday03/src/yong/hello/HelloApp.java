package yong.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class HelloApp {
	public static void main(String[] args){
		String[] configs = {"applicationContext.xml"};
		
		ApplicationContext factory = new ClassPathXmlApplicationContext(configs);
		
		MessageBean bean = (MessageBean) factory.getBean("messageBean");
		bean.sayHello();
	}
}
 
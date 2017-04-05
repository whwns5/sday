package yong.hello3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class HelloApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 루즈 커플링 방식 ( 의존도가 떨어뜨린다. ) -> Spring의 목적
		
		// 1. 문서에 대한 내용을 가져온다. // 해당 프로젝트의 src 부터를 가져온다.
		Resource resource = new ClassPathResource("applicationContext.xml"); // 문서를 불러온다.
		// 2. 문서에 해당되는 객체들을 만든다.
		BeanFactory factory = new XmlBeanFactory(resource); // 밑줄이 뜨는 이유 : 
		
		MessageBean bean = (MessageBean) factory.getBean("messageBean");
		bean.sayHello("spring");	
	}
}

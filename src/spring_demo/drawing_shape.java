package spring_demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class drawing_shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BeanFactory factory = new XmlBeanFactory (new FileSystemResource("spring.xml"));
		   Triangle triangle = (Triangle)factory.getBean("triangle");
		   triangle.draw();
		   System.out.println("Hii");
		   
	}

}

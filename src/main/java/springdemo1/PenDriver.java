package springdemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PenDriver {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring2.xml");
		Pen pen =(Pen)	applicationContext.getBean("myPen");
		System.out.println(pen.name);
		System.out.println(pen.price);
		System.out.println(pen.colour);
	}
}

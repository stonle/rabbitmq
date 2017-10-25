package rabbitmq;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.producer.MessageProducer;



public class RabbitTest {
    @SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
     	ApplicationContext context = new GenericXmlApplicationContext("classpath:/application.xml");
    	MessageProducer rod = context.getBean("producer", MessageProducer.class);
		rod.sendMessage("hello world!");
	}
}

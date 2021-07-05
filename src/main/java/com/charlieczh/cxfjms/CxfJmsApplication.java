package com.charlieczh.cxfjms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
public class CxfJmsApplication {

	@Autowired
	private JmsTemplate template;

	public static void main(String[] args) {
		SpringApplication.run(CxfJmsApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void applicationReadyEvent() throws JMSException {
		String msg = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:ser=\"http://service.wsdl2java.cxfjms.charlieczh.com/\" xmlns:ord=\"http://www.charlieczh.com/order\" xmlns:ord1=\"http://www.charlieczh.com/orderItem\" xmlns:per=\"http://www.charlieczh.com/perfume\">\n"
				+ "   <soap:Header/>\n"
				+ "   <soap:Body>\n"
				+ "      <ser:postOrderRequest>\n"
				+ "         <!--Optional:-->\n"
				+ "         <arg0>\n"
				+ "            <ord:order>\n"
				+ "               <ord:totalPrice>22.2</ord:totalPrice>\n"
				+ "               <ord:date>2003-03-03</ord:date>\n"
				+ "               <ord:firstName>charlie</ord:firstName>\n"
				+ "               <ord:lastName>cai</ord:lastName>\n"
				+ "               <ord:city>hk</ord:city>\n"
				+ "               <ord:address>hk</ord:address>\n"
				+ "               <ord:email>test@gmail.com</ord:email>\n"
				+ "               <ord:phoneNumber>456</ord:phoneNumber>\n"
				+ "               <ord:postIndex>123</ord:postIndex>\n"
				+ "               <!--1 or more repetitions:-->\n"
				+ "               <ord1:orderItem>\n"
				+ "                  <ord1:amount>789</ord1:amount>\n"
				+ "                  <ord1:quantity>2</ord1:quantity>\n"
				+ "                  <per:perfume>\n"
				+ "                     <per:id>789456123</per:id>\n"
				+ "                  </per:perfume>\n"
				+ "               </ord1:orderItem>\n"
				+ "            </ord:order>\n"
				+ "         </arg0>\n"
				+ "      </ser:postOrderRequest>\n"
				+ "   </soap:Body>\n"
				+ "</soap:Envelope>";

		Session session = template.getConnectionFactory().createConnection()
				.createSession(false, Session.AUTO_ACKNOWLEDGE);

		TextMessage message = session.createTextMessage(msg);
		message.setJMSReplyTo(new ActiveMQQueue("test.response.queue"));

		template.convertAndSend("request.queue", message);

		System.out.println("Jms Message sent");
	}

    @JmsListener(destination = "test.response.queue")
    public void receiveMessage(final Message message) throws JMSException {
		String messageData = null;
		System.out.println("Received message -> " + message);
		if (message instanceof TextMessage) {
			TextMessage textMessage = (TextMessage) message;
			messageData = textMessage.getText();
			System.out.println("Message data -> " + messageData);
		}
    }

    @JmsListener(destination = "response.queue")
    public void receiveSoapMessage(final Message message) throws JMSException {
    	System.out.println("Received JMS Message -> " + message);
        String messageData = null;

        if(message instanceof TextMessage) {
            TextMessage textMessage = (TextMessage)message;
            messageData = textMessage.getText();
            System.out.println("Received JMS Message data -> "+messageData);

        }
        template.convertAndSend("client.queue", message);
    }
}

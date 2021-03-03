package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.messages.Message;
import no.hvl.dat110.messages.PublishMsg;
import no.hvl.dat110.common.TODO;

public class DisplayDevice {
	
	private static final int COUNT = 10;
		
	public static void main (String[] args) {
		
		System.out.println("Display starting ...");
		
		// TODO - START
				
		// create a client object and use it to
		Client client = new Client(Common.TEMPTOPIC, Common.BROKERHOST, Common.BROKERPORT);
		
		// - connect to the broker
		client.connect();
		
		// - create the temperature topic on the broke
		client.createTopic(Common.TEMPTOPIC);
		
		// - subscribe to the topic
		client.subscribe(Common.TEMPTOPIC);
		
		// - receive messages on the topic
		int i = 0;
		
		// if 'i' is less then COUNT, not all messages is received 
		while(i < COUNT) {
			
		Message message = client.receive();
		
		if(message != null) {
			i++;
		}
		}
		// - unsubscribe from the topic
		client.unsubscribe(Common.TEMPTOPIC);
		
		// - disconnect from the broker
		client.disconnect();
		
		// TODO - END
		
		System.out.println("Display stopping ... ");
		
		
		
	}
}

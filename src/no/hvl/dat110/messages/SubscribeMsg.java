package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

	private String topic;

	// message sent from client to subscribe on a topic

	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text

	public SubscribeMsg(String user, String topic) {
		this.topic = topic;

	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return super.toString() + "SubscribeMsg [topic=" + topic + "]";
	}

}

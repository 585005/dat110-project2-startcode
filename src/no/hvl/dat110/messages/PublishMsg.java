package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {

	private String topic;
	private String message;

	// message sent from client to create publish a message on a topic

	// TODO:
	// Implement object variables - a topic and a message is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text

	public PublishMsg(String user, String topic, String message) {
		this.topic = topic;
		this.message = message;

	}

	public String getMessage() {

		return message;

	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return super.toString() + "PublishMsg [topic=" + topic + ", message=" + message + "]";
	}

}

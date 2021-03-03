package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {
	
	
	private String topic;
	private MessageType messageType;
	
	

	// message sent from client to create topic on the broker

	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
	public DeleteTopicMsg(String topic) {
		this.topic = topic;
		messageType = MessageType.DELETETOPIC;
	}



	public String getTopic() {
		return topic;
	}



	public void setTopic(String topic) {
		this.topic = topic;
	}



	public MessageType getMessageType() {
		return messageType;
	}



	public void setMessageType(MessageType messageType) {
		this.messageType = messageType;
	}



	@Override
	public String toString() {
		return super.toString() + "DeleteTopicMsg [topic=" + topic + ", messageType=" + messageType + "]";
	}
	
	
	
	

}

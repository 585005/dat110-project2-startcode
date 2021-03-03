package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

	private String topic; 
	private MessageType messageType;
	
	// message sent from client to unsubscribe on a topic 

	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
	public UnsubscribeMsg(String topic) {
		this.topic = topic;
		this.messageType = MessageType.UNSUBSCRIBE;
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
		return super.toString() + "UnsubscribeMsg [topic=" + topic + ", messageType=" + messageType + "]";
	}
	
	
}

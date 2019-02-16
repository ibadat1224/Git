package message;

public class VoiceMessage extends Message {
	public VoiceMessage(String Sender, String Reciever, String messageBody) {
		setType("VoiceMessage");
		setSender(Sender);
		setReciever(Reciever);
		setMessageBody(messageBody);

	}

}

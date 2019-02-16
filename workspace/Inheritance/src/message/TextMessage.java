package message;

public class TextMessage extends Message {

	public TextMessage() {

		setType("TextMessage");

	}

	public TextMessage(String Sender, String Reciever, String messageBody) {
		setType("TextMessage");
		setSender(Sender);
		setReciever(Reciever);
		setMessageBody(messageBody);

	}

}

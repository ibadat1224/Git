package message;

public class IMessage extends Message {

	public IMessage(String Sender, String Reciever, String messageBody) {
		setType("IMessage");
		setSender(Sender);
		setReciever(Reciever);
		setMessageBody(messageBody);

	}

}

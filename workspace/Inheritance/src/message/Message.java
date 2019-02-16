package message;

public class Message {

	private String Sender;
	private String Reciever;
	private String type;
	private String messageBody;

	{
		Sender = "unknown";
		Reciever = "unknown";
		type = "unknown";
		messageBody = " ";

	}

	public void send() {

		if (Sender.equals("unknown") || Reciever.equals("unknown") || messageBody.isEmpty()) {
			System.out.println("Error : Message sending failed");
			return;
		}

		String str = "Message Sent Successfully: \n" + "[Sender=" + Sender + "]\n" + "[Reciever=" + Reciever + "]\n"
				+ "[Type=" + type + "]\n" + "[MessageBody=" + messageBody + "]\n";

		System.out.println(str);
	}

	public String getSender() {
		return Sender;
	}

	public void setSender(String sender) {
		this.Sender = Sender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getReciever() {
		return Reciever;
	}

	public void setReciever(String reciever) {
		Reciever = reciever;
	}

	public void reply(String messageBody) {

		String Reciever = getReciever();
		setReciever(getSender());
		setSender(Reciever);
		setMessageBody(messageBody);
		send();
	}

	public void setMessageBody(String messageBody2) {
		this.messageBody = messageBody;
	}
}

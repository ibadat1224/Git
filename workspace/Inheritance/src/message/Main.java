package message;

public class Main extends Message {

	public static void main(String[] args) {

		TextMessage txt1 = new TextMessage();
		txt1.send();

		TextMessage txt2 = new TextMessage("Kevin", "Scott", "hi! how is it going?");
		txt2.send();

		IMessage imessage = new IMessage("Lora", "Jane", "Whats up!");
		imessage.send();

		VoiceMessage vm = new VoiceMessage("Wiki", "Tiki", "Aloha! This is Wiki!Please call me back");
		vm.send();

		Message msg = new Message();

		msg.setSender("John");
		msg.setReciever("Smith");
		msg.setMessageBody("Good morning");
		msg.send();
		msg.reply("Have a good day");
	}

}

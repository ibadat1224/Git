package message;

import java.util.ArrayList;
import java.util.List;

public class Coversation extends Object {

	public static void main(String[] args) {

		List<String> msgs = new ArrayList<>();
		msgs.add("Hello");
		msgs.add("Hi!");
		msgs.add("How are you ?What are you doing?");
		msgs.add("I am fine.Coding Java.How about you?");
		msgs.add("Also learning Java and eating bananas");
		msgs.add("Share some fancy code if you wrote");
		msgs.add("Sure.public class B etends A.Here is super class and subclasss");
		msgs.add("Cool let me tell you,that private members are not inherited");
		msgs.add("Rhite! But protected , public are alyas inherited");
		msgs.add("Awesome!,Btw default members are only inherited if both classes");
		msgs.add("Bye!");

		IMessage imessage = new IMessage("Sara", "Fatima", msgs.get(0));
		imessage.send();

		for (int i = 1; i < msgs.size(); i++) {
			imessage.reply(msgs.get(i));
		}

	}

}

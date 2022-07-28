package org.my.factorymethod;

import org.my.factorymethod.creator.JSONMessageCreator;
import org.my.factorymethod.creator.MessageCreator;
import org.my.factorymethod.creator.TextMessageCreator;
import org.my.factorymethod.message.Message;

public class Client {

	public static void main(String[] args) {
		//TODO
		printMessage(new JSONMessageCreator());
		printMessage(new TextMessageCreator());
	}
	
	public static void printMessage(MessageCreator creator) {
		//TODO
		Message message = creator.getMessage();
		System.out.println(message);
	}
}

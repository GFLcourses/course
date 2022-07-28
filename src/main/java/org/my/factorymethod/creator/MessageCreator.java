package org.my.factorymethod.creator;

import org.my.factorymethod.message.JSONMessage;
import org.my.factorymethod.message.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {

	public Message getMessage() {
		//TODO
		Message msg = createMessage();

		msg.addDefaultHeaders();
		msg.encrypt();
		return  msg;
	}
	
	//Factory method
	protected abstract Message createMessage();
}

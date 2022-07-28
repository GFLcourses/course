package org.my.factorymethod.creator;

import org.my.factorymethod.message.JSONMessage;
import org.my.factorymethod.message.Message;

public class JSONMessageCreator extends MessageCreator{
    @Override
    protected Message createMessage() {
        return new JSONMessage();
    }
}

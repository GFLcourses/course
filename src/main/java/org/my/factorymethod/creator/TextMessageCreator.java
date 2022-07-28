package org.my.factorymethod.creator;

import org.my.factorymethod.message.Message;
import org.my.factorymethod.message.TextMessage;

public class TextMessageCreator extends MessageCreator{
    @Override
    protected Message createMessage() {
        return new TextMessage();
    }
}

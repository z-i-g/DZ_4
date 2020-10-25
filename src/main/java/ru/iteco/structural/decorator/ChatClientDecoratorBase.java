package ru.iteco.structural.decorator;

public class ChatClientDecoratorBase implements IChatClient {

    IChatClient decorates;

    public ChatClientDecoratorBase(IChatClient decorates) {
        this.decorates = decorates;
    }

    @Override
    public void sendMessage(Message message) {
        decorates.sendMessage(message);
    }

    @Override
    public void getMessage() {
        decorates.getMessage();
    }
}

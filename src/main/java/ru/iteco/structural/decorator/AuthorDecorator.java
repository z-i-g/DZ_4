package ru.iteco.structural.decorator;

public class AuthorDecorator extends ChatClientDecoratorBase{

    public AuthorDecorator(IChatClient decorates) {
        super(decorates);
    }

    @Override
    public void sendMessage(Message message) {
        message.setAuthor("fhyr213");
        message.setTo("32fdj");
        super.sendMessage(message);
    }

}

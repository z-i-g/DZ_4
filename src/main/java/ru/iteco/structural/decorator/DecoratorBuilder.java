package ru.iteco.structural.decorator;

public class DecoratorBuilder {

    private IChatClient chatClient;

    public DecoratorBuilder(IChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public DecoratorBuilder withText() {
        chatClient = new TextDecorator(chatClient);
        return this;
    }

    public DecoratorBuilder withAuthor() {
        chatClient = new AuthorDecorator(chatClient);
        return this;
    }

    public IChatClient build() {
        return chatClient;
    }
}

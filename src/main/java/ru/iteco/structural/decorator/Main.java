package ru.iteco.structural.decorator;

public class Main {

    public static void main(String[] args) {

        IChatClient chatClient = new ChatClient();
        chatClient = new DecoratorBuilder(chatClient)
                .withAuthor()
                .withText()
                .build();

        chatClient.sendMessage(new Message("Ayrat", "Alina", "Hello"));
        chatClient.getMessage();

    }


}

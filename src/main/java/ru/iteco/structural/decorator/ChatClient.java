package ru.iteco.structural.decorator;

public class ChatClient  implements IChatClient{

    Message message;

    @Override
    public void sendMessage(Message message) {
        this.message = message;
        System.out.println(message);
    }

    @Override
    public void getMessage() {
        if(message != null) {
            System.out.println(message);
        }
        else {
            System.out.println("no message");
        }
    }
}

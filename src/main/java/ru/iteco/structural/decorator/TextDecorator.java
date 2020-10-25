package ru.iteco.structural.decorator;

public class TextDecorator extends ChatClientDecoratorBase{

    private Message message;

    public TextDecorator(IChatClient decorates) {
        super(decorates);
    }

    @Override
    public void sendMessage(Message message) {
        this.message = message;
        message.setText("encrypted/" + message.getText() + "/encrypted");
        super.sendMessage(message);
    }

    @Override
    public void getMessage() {
        if(message != null) {
            message.setText(message.getText().replace("encrypted/", "").replace("/encrypted", ""));
        }
        super.getMessage();
    }
}

package ru.iteco.structural.decorator;

public class Message {

    private String author;
    private String to;
    private String text;

    public Message(String author, String to, String text) {
        this.author = author;
        this.to = to;
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "author='" + author + '\'' +
                ", to='" + to + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

}

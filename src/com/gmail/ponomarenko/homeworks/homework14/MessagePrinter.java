package com.gmail.ponomarenko.homeworks.homework14;

public class MessagePrinter implements Printer {
    @Override
    public void print(Message message) {
        String sender = message.getSender();
        String text = message.getText();

        if ((sender == null || sender.length() == 0) && (text == null || text.length() == 0)) {
            System.out.println("An empty message from an anonymous user is being processed...");
        } else if (sender == null || sender.length() == 0) {
            System.out.println("An anonymous user has sent a message: " + text);
        } else {
            System.out.println("The user " + sender + " has sent a message: " + text);
        }
    }
}

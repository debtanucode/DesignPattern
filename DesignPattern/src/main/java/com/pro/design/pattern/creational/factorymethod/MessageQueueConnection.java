package com.pro.design.pattern.creational.factorymethod;

public class MessageQueueConnection extends Connection{
    public MessageQueueConnection(String dbURL , String portNo) {
        super(dbURL , portNo);
    }

    @Override
    void create() {
        System.out.println("Create method of message queue.");
    }

    @Override
    void delete() {
        System.out.println("Delete method of message queue.");
    }
}

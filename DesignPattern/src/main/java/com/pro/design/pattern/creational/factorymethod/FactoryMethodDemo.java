package com.pro.design.pattern.creational.factorymethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        System.out.println("Factory method demo...");
        // creating the db connection using factory method.
        Connection dbConnection = ConnectionFactory.getConnection(ConnectionType.DB_CONNECTION);
        dbConnection.create();
        dbConnection.delete();

        // creating the message queue connection using factory method.
        Connection mqConnection = ConnectionFactory.getConnection(ConnectionType.MESSAGE_QUEUE_CONNECTION);
        mqConnection.create();
        mqConnection.delete();
    }
}

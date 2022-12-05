package com.pro.design.pattern.creational.factorymethod;

public class ConnectionFactory {
    public static Connection getConnection(ConnectionType connectionType){
        Connection connection;

        switch (connectionType){
            case DB_CONNECTION:
                connection = new DBConnection(Property.dbConnectionURL, Property.dbConnectionPort);
                System.out.println("Data base connection object has been created.");
                break;
            case MESSAGE_QUEUE_CONNECTION:
                connection = new MessageQueueConnection(Property.messageQueueURL, Property.messageQueuePort);
                System.out.println("Message queue connection object has been created.");
                break;
            default:
                connection = null;
        }
        return connection;
    }
}

package com.pro.design.pattern.creational.factorymethod;

public enum ConnectionType {
    DB_CONNECTION("01"),
    MESSAGE_QUEUE_CONNECTION("02");

    private String value;
    ConnectionType(String value){
        this.value = value;
    }
}

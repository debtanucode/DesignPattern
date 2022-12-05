package com.pro.design.pattern.creational.factorymethod;

public abstract class Connection {
    private String dbURL;
    private String portNo;

    public Connection(String dbURL, String portNo){
        this.dbURL = dbURL;
        this.portNo = portNo;
    }

    public String getDbURL() {
        return dbURL;
    }

    public String getPortNo() {
        return portNo;
    }

    abstract void create();
    abstract void delete();
}

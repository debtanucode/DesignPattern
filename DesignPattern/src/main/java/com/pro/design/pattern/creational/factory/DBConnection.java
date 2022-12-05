package com.pro.design.pattern.creational.factory;

public class DBConnection {
    private String dbURL;
    private String portNo;

    public DBConnection(String dbURL, String portNo){
        this.dbURL = dbURL;
        this.portNo = portNo;
    }

    public String getDbURL() {
        return dbURL;
    }

    public String getPortNo() {
        return portNo;
    }
}

package com.pro.design.pattern.creational.factorymethod;

public class DBConnection extends Connection{
    public DBConnection(String dbURL , String portNo) {
        super(dbURL , portNo);
    }

    @Override
    void create() {
        System.out.println("Create method of data base.");
    }

    @Override
    void delete() {
        System.out.println("Delete method of data base.");
    }
}

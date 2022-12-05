package com.pro.design.pattern.creational.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        //DBConnection dbConnection1 = new DBConnection();
        DBConnection dbConnection = DBConnectionFactory.getDBConnection("com.oracle.database.jdbc", "1521");

        if(dbConnection!=null) {
            System.out.println("DB URL : " + dbConnection.getDbURL());
            System.out.println("DB Port: " + dbConnection.getPortNo());
        }else{
            System.out.println("Failed to create db connection.");
        }

    }
}

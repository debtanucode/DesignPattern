package com.pro.design.pattern.creational.factory;

public class DBConnectionFactory {
    public static DBConnection getDBConnection(String dbURL, String portNo){
        DBConnection dbConnection = null;
        if(isValidConnection(dbURL, portNo)) {  // If valid connection then allow the user to create the DB connection else not.
            dbConnection = new DBConnection(dbURL, portNo);
            System.out.println("DB connection created successfully....");
        }
        return  dbConnection;
    }

    // No need to focus this validation business logic to learn Factory Design Pattern.
    // As of now I am commenting the implementation part. Only one method call is valid that returns true.
    // But, in rela world something like this you have to implement.

    private static boolean isValidConnection(String dbURL , String portNo) {
        return true;
    }


    /*
    private static boolean isValidConnection(String dbURL , String portNo) {
        if(dbURL !=null && !dbURL.isEmpty() && isValidPort(portNo)){
            String completeURL = dbURL+":"+portNo;
            if(isURLReachable(completeURL)){
                return true;
            }
        }
        return false;
    }

    private static boolean isValidPort(String portNo) {
        if(portNo!=null && !portNo.isEmpty()){
            for(int i=0;i<portNo.length();i++){
                if(!Character.isDigit(portNo.charAt(i))){
                    return false;
                }
            }
        }
        return false;
    }

    private static boolean isURLReachable(String completeURL) {
        // check the connection is available in network then return true;
        return true;
    }
    ?
     */
}

package com.pro.design.pattern.creational;

import java.time.LocalDate;

public class SingletonDemo {
    public static void main(String[] args) {
        System.out.println("Singleton Demo");
        Logger logger1 = Logger.getLogger();
        Logger logger2 = Logger.getLogger();


        logger1.log(" Dummy log entry for log1");
        logger2.log(" Dummy log entry for log2");


    }
}


class Logger{
    private static volatile Logger logger;  // declare private static volatile variable

    private Logger(){}      // make private constructor

    public  static Logger getLogger(){  // get the instance using static method
        if(logger==null){
            synchronized (Logger.class){    // class level synchronized
                if(logger==null){           // double check. if null then need to create the instance
                    logger= new Logger();
                    System.out.println("new logger is created.");
                }
            }
        }
        return logger;      // return instance
    }

    public void log(String log){
        LocalDate date = LocalDate.now();
        System.out.println("#Logger [ "+ date.toString()+"] : "+ log);
    }
}



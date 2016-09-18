package com.design.pattern;

/**
 * Created by pchenthill on 9/18/16.
 */
public class ConnectionManager {
    private static volatile String connection;

    public static String getConneection () {

        if (connection == null) {
            synchronized (ConnectionManager.class) {
                if (connection == null) {
                    connection = "connected";
                    System.out.println("Initializing connection  - " + Thread.currentThread().getId());
                }
            }
        }

        System.out.println("Returning connection to thread - " + Thread.currentThread().getId());

        return connection;
    }
}
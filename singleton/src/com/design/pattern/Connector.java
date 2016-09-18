package com.design.pattern;

/**
 * Created by pchenthill on 9/18/16.
 */
public class Connector implements Runnable {
    public void run () {
        ConnectionManager.getConneection();
    }
}

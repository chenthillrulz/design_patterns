package com.design.pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Connector c1 = new Connector();
        Connector c2 = new Connector();

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();

        String conn = ConnectionManager.getConneection();
        System.out.printf("Got the connection from singleTon -  %s - %s" , conn, Thread.currentThread().getId());

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {

        }
    }
}

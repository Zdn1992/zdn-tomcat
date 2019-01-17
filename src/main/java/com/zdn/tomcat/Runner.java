package com.zdn.tomcat;

import com.zdn.tomcat.listen.Listener;

public class Runner {

    public static void main(String[] args) {
        new Listener(8080).start();
    }
}

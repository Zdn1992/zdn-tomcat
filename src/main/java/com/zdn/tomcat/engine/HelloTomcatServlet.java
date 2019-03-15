package com.zdn.tomcat.engine;

import com.zdn.tomcat.connector.ServletRequest;
import com.zdn.tomcat.connector.ServletResponse;
import com.zdn.tomcat.engine.api.AbGeneralServlet;

public class HelloTomcatServlet extends AbGeneralServlet {
    @Override
    public void doGet(ServletRequest request, ServletResponse response) {
        try {
            response.write("GET Tomcat ... ^_^");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(ServletRequest request, ServletResponse response) {
        try {
            response.write("POST Tomcat ... ^_^");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void init() {

    }

    @Override
    public void destory() {

    }

}

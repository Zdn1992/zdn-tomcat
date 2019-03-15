package com.zdn.tomcat.engine.api;

import com.zdn.tomcat.connector.ServletRequest;
import com.zdn.tomcat.connector.ServletResponse;

public abstract class AbGeneralServlet implements Servlet{
    /**
     * Get请求
     */
    public abstract void doGet(ServletRequest request, ServletResponse response);

    /**
     * Post请求
     */
    public abstract void doPost(ServletRequest request, ServletResponse response);

    @Override
    public void service(ServletRequest request, ServletResponse response) {
        String method = request.getMethod();
        if ("GET".equalsIgnoreCase(method)){
            doGet(request,response);
        }else if ("POST".equalsIgnoreCase(method)){
            doPost(request,response);
        }else if ("PUT".equalsIgnoreCase(method)){
            // ...
        }else if ("DELETE".equalsIgnoreCase(method)){
            // ...
        }
    }
}

package com.zdn.tomcat.engine.api;

import com.zdn.tomcat.connector.ServletRequest;
import com.zdn.tomcat.connector.ServletResponse;

public interface Servlet {

    void init();

    void service(ServletRequest request, ServletResponse response);

    void destory();
}

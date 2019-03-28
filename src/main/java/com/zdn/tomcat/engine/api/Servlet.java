package com.zdn.tomcat.engine.api;

import com.zdn.tomcat.connector.ServletRequest;
import com.zdn.tomcat.connector.ServletResponse;

/**
 * @Description: javax servlet规范
 * @Author: zdn
 * @CreateDate: 2019/3/28
 * @Version: 1.0
 */
public interface Servlet {

    void init();

    void service(ServletRequest request, ServletResponse response);

    void destory();
}

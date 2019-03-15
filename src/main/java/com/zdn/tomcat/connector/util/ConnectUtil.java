package com.zdn.tomcat.connector.util;

import com.zdn.tomcat.connector.ServletRequest;
import com.zdn.tomcat.connector.ServletResponse;
import com.zdn.tomcat.engine.api.AbGeneralServlet;
import com.zdn.tomcat.engine.map.ServletMapConfig;


public class ConnectUtil {


    public static void dispatch(ServletRequest request, ServletResponse response){
        String url = request.getUrl();
        String clazzName = ServletMapConfig.urlMap.get(url);
        try {
            Class clazz = Class.forName(clazzName);
            AbGeneralServlet servlet = (AbGeneralServlet) clazz.newInstance();
            servlet.service(request,response);
        } catch (Exception e) {
            System.out.println("404");
        }
    }
}

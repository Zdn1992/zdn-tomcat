package com.zdn.tomcat.engine.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: 映射配置,类似于web.xml
 * @Author: zdn
 * @CreateDate: 2019/3/28
 * @Version: 1.0
 */
public class ServletMapConfig {

    public static List<ServletMap> servletMaps = new ArrayList<>();

    public static Map<String, String> urlMap = new HashMap<>();

    static {
        // 类似web.xml中配置<servlet> 中的servlet-name servlet-mapping
        servletMaps.add(new ServletMap("HelloTomcat",
                "/hellotomcat","com.zdn.tomcat.engine.HelloTomcatServlet"));
    }
}

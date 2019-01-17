package com.zdn.tomcat.engine.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServetMapConfig {

    public static List<ServletMap> servletMaps = new ArrayList<>();

    public static Map<String, String> urlMap = new HashMap<>();

    static {
        // 类似web.xml中配置<servlet>
        servletMaps.add(new ServletMap("HelloTomcat",
                "/hellotomcat","com.zdn.tomcat.engine.HelloTomcatServlet"));
    }
}

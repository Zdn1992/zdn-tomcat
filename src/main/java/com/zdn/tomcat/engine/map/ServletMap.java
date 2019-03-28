package com.zdn.tomcat.engine.map;
/**
 * @Description: ServletMap
 * @Author: zdn
 * @CreateDate: 2019/3/28
 * @Version: 1.0
 */
public class ServletMap {

    /**
     * servletName
     */
    private String servletName;

    /**
     * url
     */
    private String url;


    /**
     * clazz
     */
    private String clazz;

    public ServletMap() {
    }

    public ServletMap(String servletName, String url, String clazz) {
        this.servletName = servletName;
        this.url = url;
        this.clazz = clazz;
    }

    public String getServletName() {
        return servletName;
    }

    public void setServletName(String servletName) {
        this.servletName = servletName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
}

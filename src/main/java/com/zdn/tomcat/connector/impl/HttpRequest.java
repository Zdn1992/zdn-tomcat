package com.zdn.tomcat.connector.impl;

import com.zdn.tomcat.connector.ServletRequest;

import java.io.IOException;
import java.io.InputStream;

public class HttpRequest implements ServletRequest {

    /**
     * 请求方式
     */
    private String method;

    /**
     * 请求地址
     */
    private String url;


    public HttpRequest() {
    }

    public HttpRequest(InputStream inputStream) throws IOException {
        String httpInfo = "";
        byte[] buffer = new byte[1024];
        int len = 0;
        if ((len = inputStream.read(buffer)) > 0){
            httpInfo = new String(buffer,0,len);
        }
        // 根据http规范读取相应的请求参数信息
        String httpGeneral = httpInfo.split("\n")[0];
        // 获取请求方式和url
        method = httpGeneral.split("\\s")[0];
        url = httpGeneral.split("\\s")[1];
    }

    @Override
    public String getMethod() {
        return this.method;
    }

    @Override
    public String getUrl() {
        return this.url;
    }
}

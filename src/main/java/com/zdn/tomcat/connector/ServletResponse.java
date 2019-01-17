package com.zdn.tomcat.connector;

import java.io.OutputStream;

public interface ServletResponse {

    OutputStream getOutputStream();

    void write(String content) throws Exception;
}

package com.zdn.tomcat.connector.impl;

import com.zdn.tomcat.connector.ServletResponse;

import java.io.IOException;
import java.io.OutputStream;

public class HttpResponse implements ServletResponse {

    private OutputStream outputStream;

    public HttpResponse() {
    }

    public HttpResponse(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void write(String content) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("HTTP/1.1 200 OK\n")
                .append("Content-Type: text/html\n")
                .append("\r\n")
                .append("<html>")
                .append("<head>")
                .append("</head>")
                .append("<body>")
                .append(content)
                .append("</body>")
                .append("</html>");
        outputStream.write(sb.toString().getBytes());
        outputStream.close();
    }

    @Override
    public OutputStream getOutputStream() {
        return this.outputStream;
    }
}

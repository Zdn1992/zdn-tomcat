package com.zdn.tomcat.listen;

import com.zdn.tomcat.connector.impl.HttpResponse;
import com.zdn.tomcat.connector.impl.HttpRequest;
import com.zdn.tomcat.connector.util.ConnectUtil;
import com.zdn.tomcat.engine.map.ServetMapConfig;
import com.zdn.tomcat.engine.map.ServletMap;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Listener {

    /**
     * 监听的端口号
     */
    private int port;

    public Listener() {
    }

    public Listener(int port) {
        this.port = port;
    }

    public void start() {
        System.out.println("Tomcat run ...");
        // 初始化Servlet配置
        initServletConfig();
        ServerSocket server = null;
        try {
            server = new ServerSocket(port);
            while (true) {
                Socket socket = server.accept();
                InputStream inputStream = socket.getInputStream();
                OutputStream outputStream = socket.getOutputStream();
                HttpRequest request = new HttpRequest(inputStream);
                HttpResponse response = new HttpResponse(outputStream);
                // 请求转发
                ConnectUtil.dispatch(request, response);
                socket.close();
            }
        } catch (Exception e) {
            System.out.println("Tomcat fail ...");
        }finally {
            if (server != null){
                try {
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void initServletConfig() {
        for (ServletMap servletMap : ServetMapConfig.servletMaps) {
            ServetMapConfig.urlMap.put(servletMap.getUrl(), servletMap.getClazz());
        }
    }

}

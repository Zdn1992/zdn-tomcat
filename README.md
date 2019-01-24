# zdn-tomcat
---
>学习来源:java技术栈微信公众号

通过学习后.简单实现一个**Tomcat**

- 模块
   1. 容器 Container
   2. 连接 Connector
   3. 监听 Listener
   
- 传送门
   1. [Container](https://github.com/Zdn1992/zdn-tomcat/tree/master/src/main/java/com/zdn/tomcat/engine)
   2. [Connector](https://github.com/Zdn1992/zdn-tomcat/tree/master/src/main/java/com/zdn/tomcat/connector)
   3. [Listener](https://github.com/Zdn1992/zdn-tomcat/tree/master/src/main/java/com/zdn/tomcat/listen)
   
---
### 测试
1. 启动项目 监听8080
![start_1](./src/test//resources/images/start_1.png)
![start_2](./src/test//resources/images/start_2.png)
2. 客户端发起GET请求
![get](./src/test//resources/images/get.png)
3. 通过Connector连接分派请求到相应的servlet,并通过反射进行初始化
![dispatch](./src/test//resources/images/dispatch.png)
4. 根据请求方式找到具体的处理方法
![service](./src/test//resources/images/service.png)
5. 处理并返回
![deal](./src/test//resources/images/deal.png)
6. 客户端收到响应
![response](./src/test//resources/images/response.png)


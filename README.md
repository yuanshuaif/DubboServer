#dubbo
1.导入依赖的jar包
2.编写service接口，及其实现类
3.dubbo配置文件的配置
    application 指当前应用名称
    registry 用来声明一个注册中心，这里声明了一个id 为 registry 的注册中心，地址是本地服务器的 2181 端口
    protocol 指该应用用 dubbo 协议在 28080 端口暴露服务
    service 声明需要暴露的服务接口
4.配置类上使用@ImportResource({"classpath:dubbo-provider.xml"})

#admin
1.导包
2.配置类上添加@EnableAdminServer
3.通过localhost:8080访问管理页面

#自定义starter
1.导入自定义装配的依赖
2.自动装配的类
3.在src/main/resources下新建META_INF/spring.factories


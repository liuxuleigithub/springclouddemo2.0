项目介绍：
    1模块：

    <modules>
        <module>configser</module>      配置中心 整合kafka实现动态更新
        <module>eurakeser</module>  eurake注册中心
        <module>productorser</module>  生产者  接合消费者实现kafka自定义消息发送，jpa查询分页等demo
        <module>consumerser</module>  消费者  说明：使用feign调用productorser中的接口  集成hystrix异常熔断     接口文档地址 http://localhost:8764/swagger-ui.html
        <module>oauthser</module>       权限服务
        <module>turbineser</module>     hystrix熔断集群监控   使用：访问http://localhost:8767/hystrix    在页面输入框中输入需要监控的微服务地址  例：http://localhost:8764/hystrix.stream
        <module>zipkinser</module>   请求追踪   使用：访问 http://localhost:9411/   可根据下拉框中数据进行过滤查看  
        <module>zuulser</module>      路由网关   实现调用微服务负载均衡
    </modules>


    kafka 自定义消息队列
    数据库集成mysql mybatis jpa
    
    
    


     环境要求：

        本地需要安装kafka并启动


     停更（断剑重铸之日，骑士归来之时。）




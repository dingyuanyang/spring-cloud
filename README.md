# spring-cloud
测试学习spring cloud 包括Eureka、ribbon、Hystix、zuul

eureka-server  //服务治理
端口：8761
访问：http://localhost:8761

default-client // 默认客户端，无任何业务
端口：8080

user //模拟用户查询服务
端口：8081
访问：http://localhost:8081/api/v1/user/admin

sso //模拟单点登录,进行了Hystrix的容错处理
端口：8082
访问：http://localhost:8082/api/v1/login/admin/123456

gateway //网关路由服务，使用zuul
端口：8083
访问：http://localhost:8083/sso/api/v1/login/admin/123456

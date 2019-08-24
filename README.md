### spring-boot-sample

#### 项目说明
SpringBoot 2.1.x 整合其他框架：MyBatis、Dubbo、Swagger2、SpringSecurity、RabbitMQ等

#### Maven模块描述

| 端口 | 模块名称 | 描述 |
| --- | --- | --- |
| 10082 | sample-amqp | 整合RabbitMQ |
| ----- | sample-api | 服务接口、工具类、实体类 |
| 10081 | sample-business | 业务接口，整合Swagger |
| ----- | sample-dal | mapper、sql语句，整合tk-mybatis |
| 20883 | sample-redis | 整合redis |
| 10083 | sample-security | 整合SpringSecurity、SpringSession |
| ----- | sample-security-browser | 浏览器认证相关配置 |
| ----- | sample-security-app | app或前后端分离项目的认证相关配置 |
| ----- | sample-security-core | 认证相关通用配置 |
| 20881 | sample-server | 服务接口实现，整合dubbo |
| 10084、20882 | sample-server-druid | 服务接口实现，整合dubbo、druid |
| 20881 | sample-server-jpa | 服务接口实现，整合jpa |
| 10085 | sample-webflux | 业务接口，整合webflux |
| 10086 | sample-wechat | 微信公众号开发 |
| 10086 | sample-wechat-tool | 微信公众号开发,使用框架：WxJava |

------------

#### 已整合框架
| 框架 | 描述 |
| --- | --- |
| SpringBoot | SpringBoot |
| SpringMVC| SpringMVC |
| Spring | Spring |
| MyBatis | MyBatis |
| Dubbo | RPC |
| tk-mybatis | 通用mapper |
| Swagger2 | 接口文档 |
| RabbitMQ | 消息队列 |
| SpringSecurity | 身份认证 |
| SpringSession | 分布式Session |
| Druid | 阿里数据库连接池 |
| Redis | Redis |
| SpringWebflux | 反应式WEB框架 |
| SpringDataJpa | jpa |
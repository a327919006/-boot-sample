### spring-boot-sample

#### 项目说明
SpringBoot 2.1.x 整合其他框架：MyBatis、Dubbo、Swagger2、SpringSecurity、RabbitMQ等

#### Maven模块描述

| 端口 | 模块名称 | 描述 |
| --- | --- | --- |
| 10082         | sample-amqp               | 整合RabbitMQ |
| -----         | sample-api                | 服务接口、工具类、实体类 |
| 10087         | sample-apollo             | 整合Apollo配置中心 |
| 10081         | sample-business           | 业务接口，整合Swagger，详情查看该模块README |
| -----         | sample-dal                | mapper、sql语句，整合tk-mybatis |
| 10090         | sample-geoip2             | 整合GeoIP2,实现根据IP地址获取对应城市 |
| 10091         | sample-hazelcase          | 整合hazelcase,分布式缓存 |
| 10088         | sample-kafka              | 整合Kafka，使用框架spring-kafka |
| 10089         | sample-kafka-origin       | 整合Kafka，使用原生kafka-client |
| 20882         | sample-mongo              | 整合MongoDB、SpringDataMongodb |
| -----         | sample-mongo-api          | MongoDB实体类、服务接口 |
| 20883         | sample-redis              | 整合Redis、SpringDataRedis |
| 10092         | sample-rocketmq           | 整合RocketMQ |
| 10083         | sample-security           | 整合SpringSecurity、SpringSession |
| -----         | sample-security-browser   | 浏览器认证相关配置 |
| -----         | sample-security-app       | app或前后端分离项目的认证相关配置 |
| -----         | sample-security-core      | 认证相关通用配置 |
| 20881         | sample-server             | 服务接口实现，整合dubbo |
| 20881,10084   | sample-server-druid       | 服务接口实现，整合dubbo、druid |
| 20881         | sample-server-jpa         | 服务接口实现，整合jpa、jdbcTemplate |
| 20881         | sample-server-jpa-more    | 服务接口实现，整合jpa、hikari，对接多数据源 |
| 20881         | sample-server-more        | 服务接口实现，整合mybatis、druid，对接多数据源 |
| 10085         | sample-webflux            | 业务接口，整合webflux |
| 10086         | sample-wechat             | 微信公众号开发，未使用框架，直接调用微信接口 |
| 10086         | sample-wechat-tool        | 微信公众号开发,使用框架：WxJava |

##### 说明
```
端口为1xxxx的模块对外提供Http接口，并整合了Swagger，方便调试。
端口为2xxxx的模块提供RPC服务，一般用于business模块调用，由business模块提供测试的http接口
无端口的模块，提供给其他模块引用，如：实体类、工具类、配置类等
```

------------

#### sql文件说明
| sql文件 | 描述 |
| --- | --- |
| boot-sample-init.sql | 基础数据库表结构 |
| boot-sample2-init.sql| 测试多数据源时的数据库表结构 |

------------

#### 已整合框架
| 框架 | 描述 |
| --- | --- |
| SpringBoot | SpringBoot |
| SpringMVC| SpringMVC |
| Spring | Spring |
| MyBatis | MyBatis |
| tk-mybatis | 通用mapper |
| Dubbo | RPC |
| Swagger2 | 接口文档 |
| RabbitMQ | 消息队列 |
| RocketMQ | 消息队列 |
| Druid | 阿里数据库连接池 |
| Redis | Redis |
| SpringSecurity | 身份认证 |
| SpringSession | 分布式Session |
| SpringWebflux | 反应式WEB框架 |
| SpringDataJpa | jpa |
| SpringDataRedis | Redis操作框架 |
| SpringDataMongodb | MongoDB操作框架 |
| SpringKafka | Kafka操作框架 |
| Apollo | Apollo配置中心 |
| Hazelcase | 分布式缓存 |



## pine-iot-seed
Pine IOT Seed


## how to use

- see CodeGenerator
- src/test/java/CodeGenerator.java

```
git pull
mvn package
mvn clean package

ps -ef|grep pine-iot-seed|grep java|awk '{print $2}'|xargs kill -9

nohup java -jar target/pine-iot-seed-1.0.jar --spring.profiles.active=prod &
```

```
java.lang.IllegalStateException: getReader() has already been called for this request
http://www.javabyexamples.com/read-request-body-multiple-times-using-spring-mvc/
```

## TODO

- 建表
- 参数校验

```
https://github.com/eclipse/paho.mqtt.android
https://github.com/moquette-io/moquette
```

```
status
operator_id
operator
comment
create_time
update_time 
```

```
每个表加一个字段
是否上传
定期清理

不建议你用time判断，用户可能更改time，导致时间错乱，用主键会更准确，
另外alarm表的time是闹钟，存在update，open那个字段，所以要处理update，
增加字段最简单，alarm需要上传device信息，userCode

如果是设备可以用deviceCode
userCode期望是用户手机号之类的
比如一个用户可能有多个设备
```

```
MyBatisGenerator base model
https://www.huaweicloud.com/articles/13253454.html

mybatis generator swagger
https://blog.csdn.net/weixin_45487503/article/details/104858648

mybatis generator swagger
```
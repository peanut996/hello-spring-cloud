
# Hello Spring Cloud

## 启动Eureka集群

```bash
mvn clean package
java -jar .\hello-spring-cloud-eureka-1.0-SNAPSHOT.jar --spring.profiles.active=replica1
java -jar .\hello-spring-cloud-eureka-1.0-SNAPSHOT.jar --spring.profiles.active=replica2
```

# Hello Spring Cloud

## 启动Eureka集群

```bash
mvn clean package
java -jar .\hello-spring-cloud-eureka-1.0-SNAPSHOT.jar --spring.profiles.active=replica1
java -jar .\hello-spring-cloud-eureka-1.0-SNAPSHOT.jar --spring.profiles.active=replica2
```


## 安装kafka

```bash
 # Get the docker image

docker pull apache/kafka:3.7.0

# Start the kafka docker container

docker run -p 9092:9092 apache/kafka:3.7.0

# Once the Kafka server has successfully launched, you will have a basic Kafka environment running and ready to use. 
```
FROM 10.3.10.140:31521/huangll/java:8
MAINTAINER huangll99@126.com
ADD ./target/micro-gateway-1.0.jar /app.jar
EXPOSE 9000
ENTRYPOINT ["/usr/bin/java","-jar","app.jar"]

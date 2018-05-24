ADD ./micro-gateway/target/micro-gateway-1.0.jar /app.jar
EXPOSE 9000
ENTRYPOINT ["/usr/bin/java","-jar","app.jar"]
FROM maven:3.5.3-jdk-8
MAINTAINER huangll99@126.com
RUN mkdir .m2
ADD .m2/* .m2/

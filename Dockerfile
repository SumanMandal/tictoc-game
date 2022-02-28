FROM registry.docker.nat.bt.com/im-microservices/alpine-java:11.0.9
MAINTAINER Swarnendu Dutta <swarnendu.dutta@bt.com>
CMD mkdir  -p /apps/product-interactions-service
ARG JAR_FILE
COPY target/${JAR_FILE} product-interactions-service.jar
CMD  java $JAVA_OPTS -jar product-interactions-service.jar
EXPOSE 9086

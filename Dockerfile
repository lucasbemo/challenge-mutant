FROM openjdk:8-jdk-alpine

VOLUME /tmp

MAINTAINER lucasbemo@gmail.com

VOLUME /tmp

ARG JAR_FILE=build/libs/challenge-mutant-*.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=prod","-jar","/app.jar"]
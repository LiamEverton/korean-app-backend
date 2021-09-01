FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/*.jar koreanapp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/koreanapp-0.0.1-SNAPSHOT.jar"]
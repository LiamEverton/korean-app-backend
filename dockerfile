FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/*.jar koreanapp-0.0.2-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/koreanapp-0.0.2-SNAPSHOT.jar"]

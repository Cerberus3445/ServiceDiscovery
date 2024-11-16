FROM openjdk:21
LABEL authors="egor"

VOLUME /tmp
WORKDIR /app
ADD maven/service-discovery-0.0.1-SNAPSHOT.jar /app/service-discovery.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "service-discovery.jar"]
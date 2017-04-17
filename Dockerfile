FROM openjdk:8-jre-alpine
EXPOSE 8080
WORKDIR /app
ADD build/libs/api-example-0.0.1-SNAPSHOT.jar /app/api.jar
ENTRYPOINT ["java", "-jar", "api.jar"]

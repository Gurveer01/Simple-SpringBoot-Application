FROM openjdk:17-jdk-slim
EXPOSE 8080
ADD target/Simple-Spring-Boot-Application-0.0.1-SNAPSHOT.jar SimpleApplication.jar
ENTRYPOINT ["java", "-jar", "SimpleApplication.jar"]
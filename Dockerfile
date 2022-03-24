FROM eclipse-temurin:11
EXPOSE 8080
ADD target/client-microservice.jar client-microservice.jar
ENTRYPOINT ["java", "-jar", "/client-microservice.jar"]
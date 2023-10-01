FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY target/spring.example-0.0.1-SNAPSHOT.jar /app
CMD ["java", "-jar", "spring.example-0.0.1-SNAPSHOT.jar"]

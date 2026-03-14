# Use Eclipse Temurin OpenJDK 17 as a parent image
FROM eclipse-temurin:17-jdk-jammy

# Set the working directory
WORKDIR /app

# Copy build jar to the container
COPY build/libs/Transaction-service-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]

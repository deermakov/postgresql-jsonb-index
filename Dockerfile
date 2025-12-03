FROM amazoncorretto:25-jdk AS builder

# Create app directory
WORKDIR /app

# Copy the pre-built JAR file
COPY target/*.jar app.jar

# Expose port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

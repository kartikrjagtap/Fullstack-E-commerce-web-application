# Using official OpenJDK image as the base image
FROM openjdk:21-jdk
MAINTAINER  Kartik Jagtap <jagtapkartik2@gmail.com>
# Set the working directory
WORKDIR /usr/src/app

# Copy the jar file
COPY target/*.jar api-gateway.jar

# Expose the port the app runs on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "api-gateway.jar"]

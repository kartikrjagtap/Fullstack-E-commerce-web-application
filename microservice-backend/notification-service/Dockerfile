# Using official OpenJDK image as the base image
FROM openjdk:21-jdk
MAINTAINER  Kartik Jagtap <jagtapkartik2@gmail.com>
# Set the working directory
WORKDIR /usr/src/app

# Copy the jar file
COPY target/*.jar notification-service.jar

# Expose the port the app runs on
EXPOSE 9020

# Command to run the application
ENTRYPOINT ["java", "-jar", "notification-service.jar"]

# Using official OpenJDK image as the base image
FROM openjdk:21-jdk
MAINTAINER  Kartik Jagtap <jagtapkartik2@gmail.com>
# Set the working directory
WORKDIR /usr/src/app

# Copy the jar file
COPY target/*.jar order-service.jar

# Expose the port the app runs on
EXPOSE 9070

# Command to run the application
ENTRYPOINT ["java", "-jar", "order-service.jar"]

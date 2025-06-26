# Use OpenJDK base image
FROM openjdk:17-jdk-slim

# Set app directory
WORKDIR /app

# Copy the JAR file (replace with actual jar name during build)
COPY target/payment-service-paypal-1.0.0.jar app.jar

# Expose internal port
EXPOSE 8082

# Start the app
ENTRYPOINT ["java", "-jar", "app.jar"]

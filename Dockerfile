# Use an official Tomcat base image
FROM tomcat:jdk21-openjdk

# Set the working directory
WORKDIR /usr/local/tomcat/webapps

# Copy the WAR file into the Tomcat webapps directory
COPY target/java-template-1.0.war /usr/local/tomcat/webapps/java-template.war

# Expose port 8080 (Tomcat's default port)
EXPOSE 8080
EXPOSE 8081

# Start Tomcat when the container is run
CMD ["catalina.sh", "run"]

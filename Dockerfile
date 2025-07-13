FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY target/springdatabase.war app.war
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.war"]
FROM eclipse-temurin:21-jre
WORKDIR /app
COPY target/student-result-1.0.0.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
CMD ["75"]

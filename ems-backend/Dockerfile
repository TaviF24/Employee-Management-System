FROM eclipse-temurin:21

WORKDIR /app

COPY target/ems-backend-0.0.1-SNAPSHOT.jar /app/ems-backend.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "ems-backend.jar"]


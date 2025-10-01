FROM amazoncorretto:17-alpine-jdk
WORKDIR /app

COPY target/smartspace-0.0.1-SNAPSHOT.jar app.jar


ENTRYPOINT ["java", "-jar", "app.jar"]

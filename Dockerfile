FROM eclipse-temurin:17-jdk-alpine
RUN mkdir /opt/app
COPY server/server-app/build/libs/server-app-1.0-all.jar /opt/app
CMD ["java", "-jar", "/opt/app/server-app-1.0-all.jar"]
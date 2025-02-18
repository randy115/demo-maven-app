FROM openjdk:21-jdk

WORKDIR /app

COPY target/demo-maven-app-0.0.1-SNAPSHOT.jar app.jar

COPY src/main/resources/application.yml /config/application.yml

EXPOSE 8080

CMD [ "java", "-jar", "app.jar", "--spring.config.additional-location=classpath:/,file:/config/" ] 

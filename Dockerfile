FROM openjdk:17
EXPOSE 8080
ADD /target/events.jar event.jar
ENTRYPOINT ["java", "-jar", "/event.jar"]
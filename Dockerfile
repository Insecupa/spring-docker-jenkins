FROM openjdk:17
EXPOSE 8080
ADD target/example-docker-spring-project.jar example-docker-spring-project
ENTRYPOINT ["java", "-jar", "/example-docker-spring-project"]
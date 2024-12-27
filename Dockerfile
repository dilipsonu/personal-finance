# FROM docker.artifactory.homedepot.com/eclipse-temurin:17-jdk-focal
FROM eclipse-temurin:21-jdk-ubi9-minimal
ADD deploy/personal-finance.jar /app/personal-finance.jar
ENTRYPOINT ["java"]
CMD ["-Djava.security.egd=file:/dev/./urandom","-jar","/app/personal-finance.jar"]
EXPOSE 8080
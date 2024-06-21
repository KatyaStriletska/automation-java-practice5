FROM openjdk:17
LABEL authors="Striletska"
WORKDIR /practice5
COPY build/libs/practice5-1.0-SNAPSHOT.jar practice5.jar
ENTRYPOINT ["java", "-jar", "practice5.jar"]
FROM adoptopenjdk:21-jdk-hotspot

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/RpgToken.jar"]

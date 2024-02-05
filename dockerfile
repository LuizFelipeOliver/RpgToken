# Stage 1: Construir o projeto
FROM alpine:latest AS build
ENV JAVA_HOME /opt/jdk/jdk-21.0.1
ENV PATH $JAVA_HOME/bin:$PATH

# Instalação do Maven e criação do diretório de trabalho
RUN apk --no-cache add maven
WORKDIR /app

# Copia apenas o arquivo POM
COPY pom.xml .

# Baixa as dependências do Maven
RUN mvn dependency:go-offline

# Copia o código-fonte e compila o projeto
COPY src src
RUN mvn package

# Stage 2: Criação da imagem mínima
FROM adoptopenjdk:21-jre-hotspot

# Define o diretório de trabalho
WORKDIR /app

# Copia o arquivo JAR do estágio de construção
COPY --from=build /app/target/RpgToken-0.0.1-SNAPSHOT.jar app.jar

# Entrypoint para executar o aplicativo
ENTRYPOINT ["java", "-jar", "app.jar"]

# Define la imagen base que se utilizará para construir la aplicación
FROM maven:3.8.4-openjdk-17-slim AS build

# Copia los archivos fuente y pom.xml a la imagen
COPY src /home/app/src
COPY pom.xml /home/app

# Configura el directorio de trabajo en la imagen
WORKDIR /home/app

# Ejecuta el comando Maven para compilar y empaquetar la aplicación
RUN mvn -B -DskipTests clean package

# Define la imagen base que se utilizará para ejecutar la aplicación
FROM openjdk:17-jdk-slim

# Copia el archivo JAR generado en la etapa anterior a la imagen final
COPY --from=build /home/app/target/my-api.jar /usr/local/lib/my-api.jar

# Expone el puerto que utiliza la API
EXPOSE 9006

# Define el comando que se ejecutará cuando el contenedor se inicie
CMD ["java", "-jar", "/usr/local/lib/my-api.jar"]



# Imagen base
FROM openjdk:17-jdk-slim

# Puerto expuesto por la aplicación
EXPOSE 9006

# Directorio de trabajo
WORKDIR /team5

# Copiar archivo pom.xml y descargar dependencias de Maven
COPY pom.xml .
RUN mvn -e -B dependency:resolve

# Copiar código fuente y construir la aplicación con Maven
COPY src/ /team5/src/
RUN mvn -e -B package

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "target/my-api.jar"]

# Imagen base con JDK 17 (puedes cambiarla según tu versión de Java)
FROM eclipse-temurin:17-jdk

# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el jar del proyecto al contenedor debes cambiar el nombre del jar por el que generes en tu proyecto (ejemplo: mypyme-0.0.1-SNAPSHOT.jar)
COPY target/mypyme-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto que usas (por ejemplo, 8080)
EXPOSE 8080

# Comando para ejecutar el jar
ENTRYPOINT ["java", "-jar", "app.jar"]

# Comandos
# .\mvnw clean package
# docker build -t spring-app .
# docker run -p 8080:8080 spring-app


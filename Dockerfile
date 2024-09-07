# Byggbilden - innehåller Maven och Java
FROM maven:3.8.5-openjdk-17 AS build

# Ställ in arbetskatalogen
WORKDIR /app

# Kopiera projektfilerna till byggmiljön
COPY . .

# Bygg applikationen
RUN mvn clean package

# Körbilden - en lättviktig Java-bild för att köra den färdiga applikationen
FROM openjdk:17-jdk-slim

# Ställ in arbetskatalogen
WORKDIR /app

# Kopiera den byggda jar-filen från byggmiljön
COPY --from=build /app/target/biathlon-0.0.1-SNAPSHOT.jar /app/biathlon.jar

# Startkommando för att köra applikationen
CMD ["java", "-jar", "/app/biathlon.jar"]

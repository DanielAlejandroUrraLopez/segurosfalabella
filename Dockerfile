FROM openjdk:11-jdk-slim
COPY "./target/segurosfalabellatest.jar" "apisegurosfalabellatest.jar"
EXPOSE 8080
ENTRYPOINT ["java","-jar","apisegurosfalabellatest.jar"]
FROM adoptopenjdk:11-jre-hotspot as builder
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} tradeprocessor.jar
RUN apt-get update
RUN java -Djarmode=layertools -jar tradeprocessor.jar extract
FROM adoptopenjdk:11-jre-hotspot
COPY --from=builder dependencies/ ./
COPY --from=builder snapshot-dependencies/ ./
COPY --from=builder spring-boot-loader/ ./
COPY --from=builder application/ ./
ENTRYPOINT ["java",  "org.springframework.boot.loader.JarLauncher"]
#ENTRYPOINT exec java $JAVA_OPTS org.springframework.boot.loader.JarLauncher



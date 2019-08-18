FROM openjdk:8-alpine
VOLUME /tmp
ADD ./target/deploy-demo-0.0.1-SNAPSHOT.jar /root/app.jar
EXPOSE 8080
EXPOSE 8083
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/root/app.jar"]
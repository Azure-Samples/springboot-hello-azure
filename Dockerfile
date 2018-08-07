FROM openjdk:8-jdk-alpine
COPY target/*.jar /usr/src/app/myapp.jar
EXPOSE 8080

CMD [ "/usr/bin/java","-jar","/usr/src/app/myapp.jar" ]

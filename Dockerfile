FROM openjdk:8-jre-alpine
WORKDIR /usr/src/app
EXPOSE 8080
CMD [ "java","-jar","myapp.jar" ]
COPY target/*.jar myapp.jar

FROM adoptopenjdk/openjdk11:ubi
LABEL Biswadip Mukherjee<19.biswadip@gmail.com>
WORKDIR Volumes/Documents/Docker/
EXPOSE 8083
ADD target/spring-security-poc.jar /spring-security-poc.jar
ENTRYPOINT ["java", "-jar" , "/spring-security-poc.jar"]



#FROM tomcat:9.0
#LABEL Biswadip Mukherjee<19.biswadip@gmail.com>
#RUN sed -i 's/port="8080"/port="4287"/' ${CATALINA_HOME}/conf/server.xml
#COPY ./target/*.war $CATALINA_HOME/webapps
#ADD target/security-poc-0.0.1-SNAPSHOT.war $CATALINA_HOME/webapps
#EXPOSE 4287
#ENTRYPOINT ["catalina.sh", "run"]

#After Docker image creation run the image on docker container using following comment :
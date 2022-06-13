# spring-security-poc - Basic Spring Security app using Spring Boot
 1. Basic Spring Boot application with Spring MVC and Restcontroller with inmemory Authentication
 2. Basic Spring Boot Web application, which is ready to be deployed in the External Tomcat Server
 3. Basic Spring Boot Web Application with basic Docker container deployment.
 4. Important Note - Spring boot application not support Tomcat-10..  
 5. To run this spring boot application in Docker bet steps to be followed 
    1. Install docker desktop in the local machine or server.
    2. Local docker instance
    3. Two ways application could be deployed in Docker:
       1. For microservice based applications will be deployed in docker container directly by deploying the artifacts as 
       JAR file, the DockerFile will have the details of the JDK on which the JAR file will be executed.
       2. Other approach is for Spring Boot Web based application (  contains static Web Resources like JSP, HTML ) can 
       be deployed in the docker conatiner with the help of Tomcat image, the dockerFile should have the details of the 
       tomcat image version and the port details on which the tomcat server would be rnning in the Docker container.
       For this case the final build artifacts would be a WAR file. 
    4. Build artifacts using Maven:
       1. mvn clean package (  Create JAR or WAR package )
       2. mvn spring-boot:run ( To run the application in local with containerization tomcat of spring boot )
    5. Docker build command is as follows :  Docker build -t application-image-name:version
    6. Run the docker image using following command : 
       1. docker run -p 9082:4287 spring-security-poc
       2. Details of the command :
          1. -p = to assign application port, 
          2. 9082 - port is in which the docker image will be accessible from client
          3. 4287 - is the port where the docker container or docker tomcat instance is running
       3. The application URL is - http://localhost:9082/spring-security-poc/loginPage
    7. Other basic Docker commands :
       1. To check Docker image details : docker images
       2. To check the log files of the containerization app : docker logs <contaier_ID>
       3. To check the running docker container processes :  docker ps 
       4. To stop the docker service : docker stop <container_id>
       5. To start the docker service : docker start <container_ID>
       6. Check Docker performence :  docker stats

    
FROM  openjdk:17
EXPOSE 8080
ADD target/githupaction.jar githupaction.jar
ENTRYPOINT ["java","-jar","/githupaction.jar"]
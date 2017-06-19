########################################################
# Dockerfile per l'applicazione sentence / eureka server 
########################################################

FROM frolvlad/alpine-oraclejdk8 

ADD build/libs/eureka-9007-0.0.1-SNAPSHOT.jar eureka-9007.jar

EXPOSE 8761

ENTRYPOINT ["/usr/bin/java", "-Xmx128m", "-Xms128m"]

CMD ["-jar", "eureka-9007.jar"]


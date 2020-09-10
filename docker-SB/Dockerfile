FROM openjdk:11
ADD build/libs/docker-SB.war docker-SB.war
EXPOSE 8097
ENTRYPOINT ["java", "-jar", "docker-SB.war"]
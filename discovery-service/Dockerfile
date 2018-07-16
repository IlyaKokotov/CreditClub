FROM openjdk
MAINTAINER Kokotov Ilya <kokotovil@yandex.ru>
ADD target/discovery-service.jar discovery-service.jar
ENTRYPOINT ["java", "-jar", "/discovery-service.jar"]
EXPOSE 8761
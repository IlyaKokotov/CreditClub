FROM openjdk
MAINTAINER Kokotov Ilya <kokotovil@yandex.ru>
ADD target/configuration-server.jar configuration-server.jar
ENTRYPOINT ["java", "-jar", "/configuration-server.jar"]
EXPOSE 8888
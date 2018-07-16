FROM openjdk
MAINTAINER Kokotov Ilya <kokotovil@yandex.ru>
ADD target/auth-server.jar auth-server.jar
ENTRYPOINT ["java", "-jar", "/auth-server.jar"]
EXPOSE 3333
FROM openjdk
MAINTAINER Kokotov Ilya <kokotovil@yandex.ru>
ADD target/auth-client.jar auth-client.jar
ENTRYPOINT ["java", "-jar", "/auth-client.jar"]
EXPOSE 2226
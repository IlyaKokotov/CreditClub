FROM openjdk
MAINTAINER Kokotov Ilya <kokotovil@yandex.ru>
ADD target/gateway-service.jar gateway-service.jar
ENTRYPOINT ["java", "-jar", "/gateway-service.jar"]
EXPOSE 8765
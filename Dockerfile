#
## Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
## Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template
#
#FROM alpine:latest
#
#CMD ["/bin/sh"]

FROM openjdk:8
EXPOSE 8086
ADD target/demo-2.6.3.jar demo-2.6.3.jar
ENTRYPOINT ["java","-jar","/demo-2.6.3.jar"]
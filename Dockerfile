FROM ubuntu:latest
MAINTAINER Tim Perry

COPY ./shared/* /opt
WORKDIR /opt
RUN apt-get update
RUN apt-get install -y openjdk-8-jdk openjdk-8-jre
#ENTRYPOINT java -jar selenium-server-standalone-3.0.1.jar -role hub && bash

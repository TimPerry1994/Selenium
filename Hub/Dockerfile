FROM provisioning_java
MAINTAINER Tim Perry

COPY ./shared/* /opt
WORKDIR /opt
RUN apt-get update
ENTRYPOINT java -jar selenium-server-standalone-3.0.1.jar -role hub


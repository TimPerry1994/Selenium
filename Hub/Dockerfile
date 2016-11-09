FROM provisioning_java
MAINTAINER Tim Perry

USER root
COPY ./shared/* /opt
WORKDIR /opt
RUN apt-get update
RUN apt-get install -y sudo ufw
RUN sed -i -e 's/DEFAULT_FORWARD_POLICY="DROP"/DEFAULT_FORWARD_POLICY="ACCEPT"/g' /etc/default/ufw
RUN ufw reload
ENTRYPOINT java -jar selenium-server-standalone-3.0.1.jar -role hub 

EXPOSE 4444
EXPOSE 80
EXPOSE 5555
